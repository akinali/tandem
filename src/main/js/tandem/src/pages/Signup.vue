<template>
  <div class="card p-4 mx-auto" style="max-width:600px;" >
    Login Sayfasıdır
    <div class="wrapper" style="text-align: left">
      <div id="formContent">
        <InputTandem
          label="Name"
          id="name"
          :value="name"
          @my-data="name = $event"
        />
        <InputTandem
          label="Surname"
          id="surname"
          :value="surname"
          @my-data="surname = $event"
        />
        <InputTandem
          label="Email"
          id="email"
          type="email"
          :value="email"
          @my-data="email = $event"
        />
        <InputTandem
          label="Password"
          id="password"
          type="password"
          :value="password"
          @my-data="password = $event"
        />
        <InputTandem
          label="Repeat Password"
          id="password2"
          type="password"
          :value="password2"
          @my-data="password2 = $event"
        />
        <div class="mb-3">
          <label for="language" class="form-label">Language</label>
          <select
            class="form-select"
            aria-label="Default select example"
            v-model="selectedLanguage"
          >
            <option name="language" selected>
              Select Language Which You Want to Learn
            </option>
            <option
              v-for="language in languages"
              :value="language.key"
              v-bind:key="language.key"
            >
              {{ language.value }}
            </option>
          </select>
        </div>

        <button class="btn btn-primary" @click="signupUser">Submit</button>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  name: "Signup",

  data() {
    return {
      name:"",
      surname:"",
      password:null,
      email:"",
      password2:null,
      selectedLanguage:null,

      languages: [
        {
          key: "TR",
          value: "Turkish",
        },
        {
          key: "FR",
          value: "French",
        },
        {
          key: "EN",
          value: "English",
        },
        {
          key: "DE",
          value: "Deutch",
        },
      ],
    };
  },
  methods: {
    signupUser() {
      var validation = this.validateUser();
      if (validation) {
        var user = {
          name:this.name,
          surname:this.surname,
          email:this.email,
          password:this.password,
          wantToLearnLanguage:this.selectedLanguage
        }
       this.$http.request("post","api/v1/users",user,true).then(response=>{
          console.log("signup result..." ,  response);
        }).catch(error=>{
          console.log(error);
        });
        console.log("ali...")
      }

    },
    validateUser() {
      console.log(
        this.email,
        this.password2,
        this.selectedLanguage,
        this.name,
        this.surname
      );
      if (!this.email) {
        return false;
      }
      return true;
    },
  },
};
</script>
