<template>
  <div class="container">
    <div>
      <!-- Nav tabs -->
      <ul class="nav nav-tabs" role="tablist">
        <li role="presentation" class="nav-item">
          <label class="nav-link" @click="activeTab = 0">           <i class="bi bi-person-bounding-box"></i>
 My Profile</label>
        </li>
        <li role="presentation" class="nav-item">
          <label class="nav-link" @click="activeTab = 1"><i class="bi bi-people"></i>My Friends</label>
        </li>
        <li role="presentation" class="nav-item">
          <label class="nav-link" @click="activeTab = 2"> <i class="bi bi-person-plus"></i>Suggestions</label>
        </li>
      </ul>

      <!-- Tab panes -->
      <div class="tab-content">
        <div
          role="tabpanel"
          class="tab-pane active"
          id="profile"
          v-if="activeTab == 0"
        >
          <AboutMe v-bind:user="user"/>
        </div>
        <div
          role="tabpanel"
          class="tab-pane active"
          id="friend"
          v-if="activeTab == 1"
        >
          <AboutFriends :user="user"/>
        </div>
        <div
          role="tabpanel"
          class="tab-pane active"
          id="suggestion"
          v-if="activeTab == 2"
        >
          <Suggestion :user="user" :refreshFriends="refreshFriends" />
        </div>
      </div>
    </div>
  </div>
</template>
<script>
import AboutFriends from "./AboutFriends";
import AboutMe from "./AboutMe";
import Suggestion from "./Suggestion";
export default {
  name: "About",
  data() {
    return {
      user: null,
      activeTab: 0,
    };
  },
  components: {
    AboutFriends,
    AboutMe,
    Suggestion,
  },
  methods: {
    getUserInfoFromApi() {
      this.user = this.$http
        .request(
          "get",
          "api/v1/users/" + this.$util.getUserInfo().id,
          null,
          true
        )
        .then((response) => {
          this.user = response.data.elements[0];
        });
    },
    refreshFriends( ){
        this.getUserInfoFromApi();
    }
  },
  mounted() {
    this.getUserInfoFromApi();
  },
  created() {},
};
</script>
