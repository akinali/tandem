(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2d0a314a"],{"013f":function(e,t,a){"use strict";a.r(t);var l=a("7a23"),n={class:"card p-4 ",style:{"max-width":"600px",margin:"auto"}},o=Object(l["g"])(" Login Sayfasıdır "),s={class:"wrapper",style:{"text-align":"left"}},c={id:"formContent"},i=Object(l["h"])("div",{class:"mb-3 form-check"},[Object(l["h"])("input",{type:"checkbox",class:"form-check-input",id:"exampleCheck1"}),Object(l["h"])("label",{class:"form-check-label",for:"exampleCheck1"},"Check me out")],-1);function r(e,t,a,r,u,d){var p=Object(l["x"])("InputTandem");return Object(l["q"])(),Object(l["d"])("div",n,[o,Object(l["h"])("div",s,[Object(l["h"])("div",c,[Object(l["h"])(p,{label:"Email",id:"email",type:"email",value:u.email,onMyData:t[1]||(t[1]=function(e){return u.email=e})},null,8,["value"]),Object(l["h"])(p,{label:"Password",id:"password",type:"password",value:u.password,onMyData:t[2]||(t[2]=function(e){return u.password=e})},null,8,["value"]),i,Object(l["h"])("button",{class:"btn btn-primary",onClick:t[3]||(t[3]=function(){return d.login&&d.login.apply(d,arguments)})},"Login")])])])}var u=a("41cb"),d={name:"Login",data:function(){return{email:null,password:null}},methods:{login:function(){var e=this;console.log("button clicked ",this.email,this.password),this.$http.request("post","api/v1/login",{email:this.email,password:this.password}).then((function(t){console.log(t),localStorage.setItem("user",JSON.stringify(t.data.elements[0])),localStorage.setItem("token",t.data.token),localStorage.setItem("isLoggedIn",!0),e.$auth.loggedIn(t.data.elements[0]),u["a"].push("home")})).catch((function(e){console.log("Hatalı kullanıcı adı veya şifre ..."),console.log(e)}))}}};d.render=r;t["default"]=d}}]);
//# sourceMappingURL=chunk-2d0a314a.01335169.js.map