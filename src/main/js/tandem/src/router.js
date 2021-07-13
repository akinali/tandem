import { createRouter, createWebHashHistory } from 'vue-router';


const routes = [
    {
        path: '/about',
        name: 'about',
        component: () => import('./pages/About.vue'),
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
    {
        path: '/chat-panel',
        name: 'chat-panel',
        component: () => import('./pages/MessageChatPanel.vue'),
    },
    {
        path: '/',
        name: 'index',
        component: () => import('./pages/Home.vue'),
    },
];

const router = createRouter({
    history: createWebHashHistory(),
    routes,
});

export default router;