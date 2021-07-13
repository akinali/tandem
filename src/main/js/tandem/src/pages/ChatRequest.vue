<template>
  <div></div>
</template>
<script>
export default {
  data() {
    return {
      channel: null,
      hasRequest: false,
      friendInfo: "",
    };
  },
  methods: {
    
    setTimeoutForChat() {
      var self = this;
      setInterval(function () {
        if (self.$auth.isLoggedIn) {
          self.$http
            .request("get", "api/v1/channel/", null, true)
            .then((res) => {
              console.log(res);
              if (res.data.successfull) {
                console.log(res);
                let temp = res.data.elements[0];
                console.log("temp", temp);
                if (temp[0]) {
                  self.channel = temp[0];
                  if (!self.hasRequest) {
                    self.hasRequest = true;
                    self.friendInfo = self.$util
                      .getUserInfo()
                      .friends.find((e) => (e.id = self.channel.user1_id));
                    let result = confirm(
                      self.friendInfo.name +
                        " " +
                        self.friendInfo.surname +
                        " seninle konuşmak istiyor. Konuşmaya katılmak istermisiniz?"
                    );
                    if (result == true) {
                      console.log("You pressed OK!");
                      self.acceptRequest();
                    } else {
                      console.log("You pressed Cancel!");

                    }
                  }
                }
              }
            });
        }
      }, 5000);
    },
    acceptRequest() {
      this.goToChatWithFriend();
    },
    goToChatWithFriend() {
      this.$router.push({
        path: "/chat-panel",
        query: { data: this.friendInfo.id },
      });
    },
    
  },
  mounted() {
    this.setTimeoutForChat();
  },
};
</script>
