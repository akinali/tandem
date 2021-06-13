<template>
  <div>
    Login Sayfasıdır
    <div class="wrapper" style="text-align: left">
      <div id="formContent">
      
        <InputTandem
          label="Email"
          id="email"
          type="email"
         :value="email" @my-data= "email = $event"
        />
         <InputTandem
          label="Password"
          id="password"
          type="password"
         :value="password" @my-data= "password = $event"
        />
       
        <div class="mb-3 form-check" >
          <input type="checkbox" class="form-check-input" id="exampleCheck1" />
          <label class="form-check-label" for="exampleCheck1"
            >Check me out</label
          >
        </div>
        <button class="btn btn-primary" @click="login">Login</button>
      </div>
    </div>
  </div>
</template>
<script>
import router from '@/router';

export default {
  name: "Login",
  data() {
    return {
      email: null,
      password:null,
    };
  },
  methods: {
    login() {
      console.log("button clicked ", this.email , this.password);
      this.$http.request("post","api/v1/login",{
        email:this.email,
        password:this.password
      }).then(response=>{
        console.log(response);
        localStorage.setItem("user",JSON.stringify(response.data.elements[0]));
        localStorage.setItem("token",response.data.token);
        localStorage.setItem("isLoggedIn",true);
        this.$auth.loggedIn(response.data.elements[0])
        router.push("home");
      })
    },
  },
};
</script>
<style scoped></style>
