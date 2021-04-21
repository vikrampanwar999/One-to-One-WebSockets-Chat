import React from 'react';
import ReactDOM from 'react-dom';
import InstagramLogin from 'react-instagram-login';

const responseInstagram = (responsek) => {
  console.log("instalogin response");
  console.log(responsek);
  localStorage.setItem("instalogin", responsek);
};

const InstaLogin= (props)=>{
  
  return (
    <div>
      <InstagramLogin
    clientId="156957412902052"
    buttonText="Login"
    redirectUri="https://cbd567452dbc.ngrok.io/instalogin"
    scope="user_profile,user_media"
    onSuccess={responseInstagram}
    onFailure={responseInstagram}
  />
   <div
  class="fb-like"
  data-share="true"
  data-width="450"
  data-show-faces="true">
</div>
    <span> Login with Instagram</span>
    </div>
  );

}

export default InstaLogin;
