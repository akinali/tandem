<template>
  <div>Login Sayfasıdır</div>
  <div class="wrapper" style="text-align:left;">
    <div id="formContent">
     
        <div class="mb-3">
          <label for="exampleInputEmail1" class="form-label"
            >Email address</label
          >
          <input
            type="email"
            class="form-control"
            id="exampleInputEmail1"
            aria-describedby="emailHelp"
          />
        
        </div>
        <InputTandem label="Username" id="username" type="email" :v-model="username"/>
        <div class="mb-3">
          <label for="exampleInputPassword1" class="form-label">Password</label>
          <input
            type="password"
            class="form-control"
            id="exampleInputPassword1"
          />
        </div>
        <div class="mb-3 form-check">
          <input type="checkbox" class="form-check-input" id="exampleCheck1" />
          <label class="form-check-label" for="exampleCheck1"
            >Check me out</label
          >
        </div>
        <button  class="btn btn-primary" @click ="buttonClicked">Submit</button>
      
    </div>
  </div>
</template>
<script>

export default {
  name: "Login",
  data () {
    return{
       username:null
    }
   
  },
  methods:{
    buttonClicked(){
      console.log("button clicked ",this.username);
    }
  }
};
</script>
<style scoped>
</style>