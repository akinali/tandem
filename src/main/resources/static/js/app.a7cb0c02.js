(function(e){function t(t){for(var a,o,u=t[0],l=t[1],i=t[2],s=0,d=[];s<u.length;s++)o=u[s],Object.prototype.hasOwnProperty.call(r,o)&&r[o]&&d.push(r[o][0]),r[o]=0;for(a in l)Object.prototype.hasOwnProperty.call(l,a)&&(e[a]=l[a]);b&&b(t);while(d.length)d.shift()();return c.push.apply(c,i||[]),n()}function n(){for(var e,t=0;t<c.length;t++){for(var n=c[t],a=!0,o=1;o<n.length;o++){var u=n[o];0!==r[u]&&(a=!1)}a&&(c.splice(t--,1),e=l(l.s=n[0]))}return e}var a={},o={app:0},r={app:0},c=[];function u(e){return l.p+"js/"+({}[e]||e)+"."+{"chunk-09095eb2":"df9e7e99","chunk-2d0a314a":"01335169","chunk-2d21a719":"ce4ecf95","chunk-2d2253e5":"d8387370","chunk-b589140a":"69277343"}[e]+".js"}function l(t){if(a[t])return a[t].exports;var n=a[t]={i:t,l:!1,exports:{}};return e[t].call(n.exports,n,n.exports,l),n.l=!0,n.exports}l.e=function(e){var t=[],n={"chunk-09095eb2":1,"chunk-b589140a":1};o[e]?t.push(o[e]):0!==o[e]&&n[e]&&t.push(o[e]=new Promise((function(t,n){for(var a="css/"+({}[e]||e)+"."+{"chunk-09095eb2":"36c21fca","chunk-2d0a314a":"31d6cfe0","chunk-2d21a719":"31d6cfe0","chunk-2d2253e5":"31d6cfe0","chunk-b589140a":"ca342fb2"}[e]+".css",r=l.p+a,c=document.getElementsByTagName("link"),u=0;u<c.length;u++){var i=c[u],s=i.getAttribute("data-href")||i.getAttribute("href");if("stylesheet"===i.rel&&(s===a||s===r))return t()}var d=document.getElementsByTagName("style");for(u=0;u<d.length;u++){i=d[u],s=i.getAttribute("data-href");if(s===a||s===r)return t()}var b=document.createElement("link");b.rel="stylesheet",b.type="text/css",b.onload=t,b.onerror=function(t){var a=t&&t.target&&t.target.src||r,c=new Error("Loading CSS chunk "+e+" failed.\n("+a+")");c.code="CSS_CHUNK_LOAD_FAILED",c.request=a,delete o[e],b.parentNode.removeChild(b),n(c)},b.href=r;var f=document.getElementsByTagName("head")[0];f.appendChild(b)})).then((function(){o[e]=0})));var a=r[e];if(0!==a)if(a)t.push(a[2]);else{var c=new Promise((function(t,n){a=r[e]=[t,n]}));t.push(a[2]=c);var i,s=document.createElement("script");s.charset="utf-8",s.timeout=120,l.nc&&s.setAttribute("nonce",l.nc),s.src=u(e);var d=new Error;i=function(t){s.onerror=s.onload=null,clearTimeout(b);var n=r[e];if(0!==n){if(n){var a=t&&("load"===t.type?"missing":t.type),o=t&&t.target&&t.target.src;d.message="Loading chunk "+e+" failed.\n("+a+": "+o+")",d.name="ChunkLoadError",d.type=a,d.request=o,n[1](d)}r[e]=void 0}};var b=setTimeout((function(){i({type:"timeout",target:s})}),12e4);s.onerror=s.onload=i,document.head.appendChild(s)}return Promise.all(t)},l.m=e,l.c=a,l.d=function(e,t,n){l.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:n})},l.r=function(e){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},l.t=function(e,t){if(1&t&&(e=l(e)),8&t)return e;if(4&t&&"object"===typeof e&&e&&e.__esModule)return e;var n=Object.create(null);if(l.r(n),Object.defineProperty(n,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var a in e)l.d(n,a,function(t){return e[t]}.bind(null,a));return n},l.n=function(e){var t=e&&e.__esModule?function(){return e["default"]}:function(){return e};return l.d(t,"a",t),t},l.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},l.p="/",l.oe=function(e){throw console.error(e),e};var i=window["webpackJsonp"]=window["webpackJsonp"]||[],s=i.push.bind(i);i.push=t,i=i.slice();for(var d=0;d<i.length;d++)t(i[d]);var b=s;c.push([0,"chunk-vendors"]),n()})({0:function(e,t,n){e.exports=n("56d7")},"20fb":function(e,t,n){},"41cb":function(e,t,n){"use strict";n("d3b7"),n("3ca3"),n("ddb0");var a=n("6c02"),o=[{path:"/about",name:"about",component:function(){return n.e("chunk-09095eb2").then(n.bind(null,"a1d1"))}},{path:"/login",name:"login",component:function(){return n.e("chunk-2d0a314a").then(n.bind(null,"013f"))}},{path:"/signup",name:"signup",component:function(){return n.e("chunk-2d2253e5").then(n.bind(null,"e422"))}},{path:"/chat-panel",name:"chat-panel",component:function(){return n.e("chunk-b589140a").then(n.bind(null,"90df"))}},{path:"/",name:"index",component:function(){return n.e("chunk-2d21a719").then(n.bind(null,"bc13"))}}],r=Object(a["a"])({history:Object(a["b"])(),routes:o});t["a"]=r},4843:function(e,t,n){"use strict";n("20fb")},"56d7":function(e,t,n){"use strict";n.r(t);n("e260"),n("e6cf"),n("cca6"),n("a79d"),n("ab8b"),n("7b17");var a=n("7a23"),o={class:"mb-3"},r={for:"exampleInput",class:"form-label"};function c(e,t,n,c,u,l){return Object(a["q"])(),Object(a["d"])("div",o,[Object(a["h"])("label",r,Object(a["z"])(n.label),1),Object(a["G"])(Object(a["h"])("input",{type:n.type?n.type:"text",class:n.clazz?n.clazz:"form-control",id:n.id?n.id:"form-control","onUpdate:modelValue":t[1]||(t[1]=function(e){return u.inputValue=e}),onKeyup:t[2]||(t[2]=function(){return l.inputKeyup&&l.inputKeyup.apply(l,arguments)})},null,42,["type","id"]),[[a["B"],u.inputValue]])])}var u={name:"InputTandem",props:{label:String,type:String,id:String,clazz:String,value:String},data:function(){return{inputValue:this.value}},methods:{inputKeyup:function(){console.log("from child ",this.inputValue),this.$emit("my-data",this.inputValue)}}};u.render=c;var l=u,i=n("41cb"),s={class:"container"},d={style:{}},b={class:"layout-main"};function f(e,t,n,o,r,c){var u=Object(a["x"])("Menus"),l=Object(a["x"])("ChatRequest"),i=Object(a["x"])("router-view");return Object(a["q"])(),Object(a["d"])("div",null,[Object(a["h"])(u),Object(a["h"])(l),Object(a["h"])("div",s,[Object(a["h"])("div",d,[Object(a["h"])("div",b,[Object(a["h"])(i)])])])])}function h(e,t,n,o,r,c){return Object(a["q"])(),Object(a["d"])("div")}n("7db0"),n("b0c0");var p={data:function(){return{channel:null,hasRequest:!1,friendInfo:""}},methods:{setTimeoutForChat:function(){var e=this;setInterval((function(){e.$auth.isLoggedIn&&e.$http.request("get","api/v1/channel/",null,!0).then((function(t){if(console.log(t),t.data.successfull){console.log(t);var n=t.data.elements[0];if(console.log("temp",n),n[0]&&(e.channel=n[0],!e.hasRequest)){e.hasRequest=!0,e.friendInfo=e.$util.getUserInfo().friends.find((function(t){return t.id=e.channel.user1_id}));var a=confirm(e.friendInfo.name+" "+e.friendInfo.surname+" seninle konuşmak istiyor. Konuşmaya katılmak istermisiniz?");1==a?(console.log("You pressed OK!"),e.acceptRequest()):console.log("You pressed Cancel!")}}}))}),5e3)},acceptRequest:function(){this.goToChatWithFriend()},goToChatWithFriend:function(){this.$router.push({path:"/chat-panel",query:{data:this.friendInfo.id}})}},mounted:function(){this.setTimeoutForChat()}};p.render=h;var g=p,v={class:"mb-5"},m={class:"navbar navbar-expand-lg navbar-light bg-light",style:{width:"100%"}},O={class:"container-fluid"},j=Object(a["h"])("a",{class:"navbar-brand",href:"#"},"TANDEM",-1),y=Object(a["h"])("button",{class:"navbar-toggler",type:"button","data-bs-toggle":"collapse","data-bs-target":"#navbarSupportedContent","aria-controls":"navbarSupportedContent","aria-expanded":"false","aria-label":"Toggle navigation"},[Object(a["h"])("span",{class:"navbar-toggler-icon"})],-1),k={class:"collapse navbar-collapse",id:"navbarSupportedContent"},w={class:"navbar-nav me-auto mb-2 mb-lg-0"},I={class:"nav-item"},S=Object(a["g"])("Login"),q={class:"nav-item"},P=Object(a["g"])("About"),x={class:"nav-item"},$=Object(a["g"])("Signup"),C=Object(a["h"])("li",{class:"nav-item dropdown"},[Object(a["h"])("a",{class:"nav-link dropdown-toggle",href:"#",id:"navbarDropdown",role:"button","data-bs-toggle":"dropdown","aria-expanded":"false"}," Dropdown "),Object(a["h"])("ul",{class:"dropdown-menu","aria-labelledby":"navbarDropdown"},[Object(a["h"])("li",null,[Object(a["h"])("a",{class:"dropdown-item",href:"#"},"Action")]),Object(a["h"])("li",null,[Object(a["h"])("a",{class:"dropdown-item",href:"#"},"Another action")]),Object(a["h"])("li",null,[Object(a["h"])("hr",{class:"dropdown-divider"})]),Object(a["h"])("li",null,[Object(a["h"])("a",{class:"dropdown-item",href:"#"},"Something else here")])])],-1),T=Object(a["h"])("li",{class:"nav-item"},[Object(a["h"])("a",{class:"nav-link disabled",href:"#",tabindex:"-1","aria-disabled":"true"},"Disabled")],-1),L={class:"d-flex"},_=Object(a["g"])("Logout"),E=Object(a["g"])("Login"),A=Object(a["g"])("Signup");function F(e,t,n,o,r,c){var u=Object(a["x"])("router-link");return Object(a["q"])(),Object(a["d"])("div",v,[Object(a["h"])("nav",m,[Object(a["h"])("div",O,[j,y,Object(a["h"])("div",k,[Object(a["h"])("ul",w,[Object(a["h"])("li",I,[Object(a["h"])(u,{class:"nav-link","active-class":"active",to:"/login"},{default:Object(a["F"])((function(){return[S]})),_:1})]),Object(a["h"])("li",q,[Object(a["h"])(u,{class:"nav-link","active-class":"active",to:"/about"},{default:Object(a["F"])((function(){return[P]})),_:1})]),Object(a["h"])("li",x,[Object(a["h"])(u,{class:"nav-link","active-class":"active",to:"/signup"},{default:Object(a["F"])((function(){return[$]})),_:1})]),C,T]),Object(a["h"])("form",L,[e.$auth.isLoggedIn?(Object(a["q"])(),Object(a["d"])(u,{key:0,class:"btn btn-outline-success",to:"/login",onClick:c.logout},{default:Object(a["F"])((function(){return[_]})),_:1},8,["onClick"])):(Object(a["q"])(),Object(a["d"])(u,{key:1,class:"btn btn-outline-success",to:"/login"},{default:Object(a["F"])((function(){return[E]})),_:1})),e.$auth.isLoggedIn?(Object(a["q"])(),Object(a["d"])(u,{key:2,class:"btn btn-outline-success",to:"/account"},{default:Object(a["F"])((function(){return[Object(a["g"])(Object(a["z"])(e.$auth.user.name+"\t"+e.$auth.user.surname),1)]})),_:1})):(Object(a["q"])(),Object(a["d"])(u,{key:3,class:"btn btn-outline-success",to:"/signup"},{default:Object(a["F"])((function(){return[A]})),_:1}))])])])])])}var z={name:"xx",methods:{logout:function(){var e=this;this.$http.request("post","api/v1/logout",null,!0).then((function(t){console.log("işlem başarılı",t.message),e.$util.loggedOut(),e.$auth.loggedOut()}))}}};z.render=F;var D=z,K={name:"App",components:{Menus:D,ChatRequest:g}};n("4843");K.render=f;var M=K,N=n("bc3a"),R=n.n(N),U=n("2106"),V=n.n(U),B=n("d4ec"),J=n("bee2"),G=function(){function e(){Object(B["a"])(this,e)}return Object(J["a"])(e,null,[{key:"requestPrivate",value:function(e,t,n,a){switch(e.toUpperCase()){case"GET":return W(a).get(t,n);case"POST":return W(a).post(t,n);case"PUT":return W(a).put(t,n);case"DELETE":return W(a).delete(t,n);default:console.log("hatali type...")}}},{key:"request",value:function(t,n,a,o){return e.requestPrivate(t,n,a,o).then((function(e){return e.successfull,console.log(e.message),e}))}}]),e}();function W(e){return e&&localStorage.getItem("token")&&(R.a.defaults.headers["Authorization"]=localStorage.getItem("token")),R.a}var Y=function(){function e(){Object(B["a"])(this,e)}return Object(J["a"])(e,null,[{key:"isLoggedIn",value:function(){return"true"==localStorage.getItem("isLoggedIn")}},{key:"getUserInfo",value:function(){return JSON.parse(localStorage.getItem("user"))}},{key:"loggedOut",value:function(){localStorage.setItem("user",null),localStorage.getItem("isLoggedIn","false")}}]),e}();i["a"].beforeEach((function(e,t,n){window.scrollTo(0,0),n()}));var H=Object(a["c"])(M);H.use(i["a"]),H.use(V.a,R.a),H.config.globalProperties.$http=G,H.config.globalProperties.$util=Y,H.config.globalProperties.$auth=Object(a["u"])({isLoggedIn:H.config.globalProperties.$util.isLoggedIn(),user:H.config.globalProperties.$util.getUserInfo(),loggedIn:function(e){H.config.globalProperties.$auth.isLoggedIn=!0,H.config.globalProperties.$auth.user=e},loggedOut:function(){H.config.globalProperties.$auth.isLoggedIn=!1,H.config.globalProperties.$auth.user=null}}),H.component("InputTandem",l),H.mount("#app")}});
//# sourceMappingURL=app.a7cb0c02.js.map