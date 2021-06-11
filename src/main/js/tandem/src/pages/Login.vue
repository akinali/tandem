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
        <button class="btn btn-primary" @click="buttonClicked">Submit</button>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  name: "Login",
  data() {
    return {
      email: null,
      password:null,
    };
  },
  methods: {
    buttonClicked() {
      console.log("button clicked ", this.email , this.password);
    },
  },
};
</script>
<style scoped></style>
