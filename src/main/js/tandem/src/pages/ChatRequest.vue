<template>
  <div>
    <div class="modal" tabindex="1" id="exampleModal">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title">
              Yeni Bir Konuşma İsteğiniz bulunmaktadır..
            </h5>
            <button
              type="button"
              class="btn-close"
              data-bs-dismiss="modal"
              aria-label="Close"
            ></button>
          </div>
          <div class="modal-body">
            <p>
              Sizinle
              {{ this.friendInfo.name + " " + this.friendInfo.surname }}
              konuşmak istiyor
            </p>
          </div>
          <div class="modal-footer">
            <button
              type="button"
              class="btn btn-secondary"
              data-bs-dismiss="modal"
            >
              Hayır istemiyorum
            </button>
            <button
              type="button"
              class="btn btn-primary"
              v-if="this.$auth.isLoggedIn"
            >
              Evet Kabul Ediyorum.
            </button>
          </div>
        </div>
      </div>
    </div>
    <button
      type="button"
      class="btn btn-primary"
      data-bs-toggle="modal"
      data-bs-target="#exampleModal"
      style="display: none"
      id="modalRunnerButtonId"
    >
      Launch demo modal
    </button>
  
  </div>
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
                      .friends.filter((e) => (e.id = self.channel.user1_id));
                    document.getElementById("modalRunnerButtonId").click();
                  }
                }
              }
            });
        }
      }, 2000);
    },
  },
  mounted(){
    this.setTimeoutForChat();
  }
};
</script>
