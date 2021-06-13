<template>
    <div class="container">
        <div class="card">
            Şuanda Anasayfada bulunmaktasınız.. Değil mi

            <p>
                {{user}}
            </p>

        </div>
    </div>
</template>
<script>

export default ({
    name:"Home",
    data(){
        return {
            user:null
        }
    },
    methods:{
        getUserInfoFromLocalStorage(){
            this.user = this.$util.getUserInfo();
        }
    },
    mounted(){
        this.getUserInfoFromLocalStorage();
    },
    created(){

    }
})
</script>
