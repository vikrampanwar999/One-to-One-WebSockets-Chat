import React from 'react';
import ReactDOM from 'react-dom';
import InstagramLogin from 'react-instagram-login';
import axios from 'axios';
import properties from '../config/properties';
const FormData = require('form-data');

const getInstaUserInfo=(response)=>{
  console.log('inside getInstaUserInfo');
  console.log(response.data);
  axios.post(properties.INSTA_USER_INFO,response.data)
    .then(function (response) {
      //handle success
      console.log(response);
    })
    .catch(function (response) {
      //handle error
      console.log(response);
    });
}

const failedresponseInstagram = (responsek) => {
  console.log("instalogin failrue response");
  console.log(responsek);
  localStorage.setItem("instalogin", responsek);
};

const successResponse=(code)=>{
  var bodyFormData = new FormData();
  bodyFormData.append('redirect_uri', properties.INSTA_REDIRECT_URL);
  bodyFormData.append('code', code);
  bodyFormData.append('client_id', properties.INSTA_CLIENT_ID);
  bodyFormData.append('client_secret', properties.INSTA_CLIENT_SECRECT);
  bodyFormData.append('grant_type', 'authorization_code');
  axios({
    method: "post",
    url: properties.INSTA_ACCESS_TOKEN_URL,
    data: bodyFormData,
    headers: { "Content-Type": "multipart/form-data",
    Accept: 'application/vnd.api+json',
  },
  })
    .then(getInstaUserInfo)
    .catch(function (response) {
      //handle error
      console.log(response);
    });
}
const InstaLogin= (props)=>{
  
  return (
    <InstagramLogin
    clientId={properties.INSTA_CLIENT_ID}
    buttonText="Login"
    redirectUri={properties.INSTA_REDIRECT_URL}
    scope="user_profile,user_media"
    onSuccess={successResponse}
    onFailure={failedresponseInstagram}
  />
 
  );

}

export default InstaLogin;
