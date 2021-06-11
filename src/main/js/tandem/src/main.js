
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap";
import InputTandem from "./components/InputTandem"
import { createApp } from 'vue'
import router from "./router";
import App from './App.vue'

router.beforeEach(function(to, from, next) {
    window.scrollTo(0, 0);
    next();
});
const app = createApp(App);
app.use(router);
app.component("InputTandem",InputTandem);
app.mount('#app')
