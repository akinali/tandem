(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2d0a314a"],{"013f":function(e,t,a){"use strict";a.r(t);var n=a("7a23"),l=Object(n["e"])(" Login Sayfasıdır "),o={class:"wrapper",style:{"text-align":"left"}},s={id:"formContent"},i=Object(n["f"])("div",{class:"mb-3 form-check"},[Object(n["f"])("input",{type:"checkbox",class:"form-check-input",id:"exampleCheck1"}),Object(n["f"])("label",{class:"form-check-label",for:"exampleCheck1"},"Check me out")],-1);function c(e,t,a,c,r,u){var d=Object(n["t"])("InputTandem");return Object(n["o"])(),Object(n["d"])("div",null,[l,Object(n["f"])("div",o,[Object(n["f"])("div",s,[Object(n["f"])(d,{label:"Email",id:"email",type:"email",value:r.email,onMyData:t[1]||(t[1]=function(e){return r.email=e})},null,8,["value"]),Object(n["f"])(d,{label:"Password",id:"password",type:"password",value:r.password,onMyData:t[2]||(t[2]=function(e){return r.password=e})},null,8,["value"]),i,Object(n["f"])("button",{class:"btn btn-primary",onClick:t[3]||(t[3]=function(){return u.login&&u.login.apply(u,arguments)})},"Login")])])])}var r=a("41cb"),u={name:"Login",data:function(){return{email:null,password:null}},methods:{login:function(){var e=this;console.log("button clicked ",this.email,this.password),this.$http.request("post","api/v1/login",{email:this.email,password:this.password}).then((function(t){console.log(t),localStorage.setItem("user",JSON.stringify(t.data.elements[0])),localStorage.setItem("token",t.data.token),localStorage.setItem("isLoggedIn",!0),e.$auth.loggedIn(t.data.elements[0]),r["a"].push("home")}))}}};u.render=c;t["default"]=u}}]);
//# sourceMappingURL=chunk-2d0a314a.6fbc524b.js.map