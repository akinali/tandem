export default class Util {
    static isLoggedIn(){
        return localStorage.getItem("isLoggedIn")=="true";
    }
    static getUserInfo(){
       return JSON.parse(localStorage.getItem("user"));

    }
    static loggedOut(){
        localStorage.setItem("user",null);
        localStorage.getItem("isLoggedIn","false");
    }
}