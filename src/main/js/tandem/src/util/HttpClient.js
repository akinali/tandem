import axios from "axios"
export default class HttpClient {
  
  
    static requestPrivate(type,url,requestBody,isSecure){
        
        switch (type.toUpperCase()){
            case "GET":{
               return getAxios(isSecure).get(url,requestBody)
            }
            case "POST":{
               return getAxios(isSecure).post(url,requestBody)

            }
            case "PUT":{
                return getAxios(isSecure).put(url,requestBody)

            }
            case "DELETE":{
                return getAxios(isSecure).delete(url,requestBody)

            }
            default:{
                console.log("hatali type...")
            }
        }

    }

   static request(type,url,requestBody,isSecure){
        
   return  HttpClient.requestPrivate(type,url,requestBody,isSecure).then(response=>{
            if(response.successfull){
                console.log(response.message); //global a suscces mesajı at..
            }
            else{
                console.log(response.message); //global a error message ..
            }
            return response; 
        })
    }
}

function getAxios(isSecure){
    if(isSecure && localStorage.getItem("token"))
    {
     axios.defaults.headers['Authorization'] = localStorage.getItem("token");

    }
    return axios;

}