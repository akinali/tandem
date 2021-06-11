<template>
<div>
  <Menus/>
  <div class="container">
  <div class="card p-4" style="max-width:600px;margin:auto;"> 
     <div class="layout-main">
			<router-view />
		</div></div>
  </div>
</div>

</template>

<script>
import xx from './pages/Menus.vue'
export default {
  name: 'App',
  components: {
    Menus:xx
  }
}
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
