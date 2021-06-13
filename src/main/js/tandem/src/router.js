import { createRouter, createWebHashHistory } from 'vue-router';


const routes = [
    {
        path: '/home',
        name: 'home',
        component: () => import('./pages/Home.vue'),
    },
   
    {
        path: '/login',
        name: 'login',
        component: () => import('./pages/Login.vue'),
    },
    {
        path: '/signup',
        name: 'signup',
        component: () => import('./pages/Signup.vue'),
    },
];

const router = createRouter({
    history: createWebHashHistory(),
    routes,
});

export default router;