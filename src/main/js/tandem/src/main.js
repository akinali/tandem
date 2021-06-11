
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap";
import InputTandem from "./components/InputTandem"
import { createApp } from 'vue'
import App from './App.vue'


const app = createApp(App);
app.component("InputTandem",InputTandem);
app.mount('#app')
