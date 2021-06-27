<template>
  <div>
    <Menus />
        <ChatRequest/>

    <div class="container">
      <div style="">
        <div class="layout-main">
          <router-view />
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import ChatRequest from './pages/ChatRequest.vue';
import xx from "./pages/Menus.vue";
export default {
  name: "App",
  components: {
    Menus: xx,
    ChatRequest,
  },
 

};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>
