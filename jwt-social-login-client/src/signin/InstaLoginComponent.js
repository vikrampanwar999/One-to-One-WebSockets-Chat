import React from 'react';

class InstaLoginComponent extends React.Component {
  componentDidMount() {
    const apiUrl = 'https://api.instagram.com/oauth/authorize?client_id=156957412902052&redirect_uri=https://cbd567452dbc.ngrok.io/login&scope=user_profile,user_media&response_type=code';
    fetch(apiUrl,{
        crossDomain:true,
        method: 'GET',
        headers: {'Content-Type':'application/json'}})
      .then((response) => response.json())
      .then((data) => console.log('This is your data', data));
  }
  render() {
    return <h1>my Component has Mounted, Check the browser 'console' </h1>;
  }
}
export default InstaLoginComponent;
