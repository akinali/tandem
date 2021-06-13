
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap";
import InputTandem from "./components/InputTandem"
import { createApp, reactive } from 'vue'
import router from "./router";
import App from './App.vue'
import axios from 'axios'
import VueAxios from 'vue-axios'
import HttpClient from './util/HttpClient'
import Util from './util/Util';

router.beforeEach(function(to, from, next) {
    window.scrollTo(0, 0);
    next();
});
const app = createApp(App);
app.use(router);
app.use(VueAxios, axios)
app.config.globalProperties.$http = HttpClient;
app.config.globalProperties.$util=Util;
app.config.globalProperties.$auth= reactive({
    isLoggedIn:app.config.globalProperties.$util.isLoggedIn(),
    user:app.config.globalProperties.$util.getUserInfo(),
    loggedIn:(user)=>{
        app.config.globalProperties.$auth.isLoggedIn=true;
        app.config.globalProperties.$auth.user=user;
    },
    loggedOut(){
        app.config.globalProperties.$auth.isLoggedIn=false;
        app.config.globalProperties.$auth.user=null;
    }
})
app.component("InputTandem",InputTandem);
app.mount('#app')
