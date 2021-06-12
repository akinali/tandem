
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap";
import InputTandem from "./components/InputTandem"
import { createApp } from 'vue'
import router from "./router";
import App from './App.vue'
import axios from 'axios'
import VueAxios from 'vue-axios'
import HttpClient from './util/HttpClient'

router.beforeEach(function(to, from, next) {
    window.scrollTo(0, 0);
    next();
});
const app = createApp(App);
app.use(router);
app.use(VueAxios, axios)
app.config.globalProperties.$http = HttpClient;
app.component("InputTandem",InputTandem);
app.mount('#app')
