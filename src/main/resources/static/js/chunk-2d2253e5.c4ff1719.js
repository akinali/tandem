(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2d2253e5"],{e422:function(e,a,n){"use strict";n.r(a);n("b0c0");var t=n("7a23"),l=Object(t["e"])(" Login Sayfasıdır "),s={class:"wrapper",style:{"text-align":"left"}},u={id:"formContent"},r={class:"mb-3"},o=Object(t["f"])("label",{for:"language",class:"form-label"},"Language",-1),i=Object(t["f"])("option",{name:"language",selected:""}," Select Language Which You Want to Learn ",-1);function c(e,a,n,c,d,p){var b=Object(t["t"])("InputTandem");return Object(t["o"])(),Object(t["d"])("div",null,[l,Object(t["f"])("div",s,[Object(t["f"])("div",u,[Object(t["f"])(b,{label:"Name",id:"name",value:d.name,onMyData:a[1]||(a[1]=function(e){return d.name=e})},null,8,["value"]),Object(t["f"])(b,{label:"Surname",id:"surname",value:d.surname,onMyData:a[2]||(a[2]=function(e){return d.surname=e})},null,8,["value"]),Object(t["f"])(b,{label:"Email",id:"email",type:"email",value:d.email,onMyData:a[3]||(a[3]=function(e){return d.email=e})},null,8,["value"]),Object(t["f"])(b,{label:"Password",id:"password",type:"password",value:d.password,onMyData:a[4]||(a[4]=function(e){return d.password=e})},null,8,["value"]),Object(t["f"])(b,{label:"Repeat Password",id:"password2",type:"password",value:d.password2,onMyData:a[5]||(a[5]=function(e){return d.password2=e})},null,8,["value"]),Object(t["f"])("div",r,[o,Object(t["B"])(Object(t["f"])("select",{class:"form-select","aria-label":"Default select example","onUpdate:modelValue":a[6]||(a[6]=function(e){return d.selectedLanguage=e})},[i,(Object(t["o"])(!0),Object(t["d"])(t["a"],null,Object(t["s"])(d.languages,(function(e){return Object(t["o"])(),Object(t["d"])("option",{value:e.key,key:e.key},Object(t["v"])(e.value),9,["value"])})),128))],512),[[t["y"],d.selectedLanguage]])]),Object(t["f"])("button",{class:"btn btn-primary",onClick:a[7]||(a[7]=function(){return p.signupUser&&p.signupUser.apply(p,arguments)})},"Submit")])])])}var d={name:"Signup",data:function(){return{name:"",surname:"",password:null,email:"",password2:null,selectedLanguage:null,languages:[{key:"TR",value:"Turkish"},{key:"FR",value:"French"},{key:"EN",value:"English"},{key:"DE",value:"Deutch"}]}},methods:{signupUser:function(){var e=this.validateUser();if(e){var a={name:this.name,surname:this.surname,email:this.email,password:this.password,wantToLearnLanguage:this.selectedLanguage};this.$http.request("post","api/v1/users",a,!0).then((function(e){console.log("signup result...",e)})).catch((function(e){console.log(e)})),console.log("ali...")}},validateUser:function(){return console.log(this.email,this.password2,this.selectedLanguage,this.name,this.surname),!!this.email}}};d.render=c;a["default"]=d}}]);
//# sourceMappingURL=chunk-2d2253e5.c4ff1719.js.map