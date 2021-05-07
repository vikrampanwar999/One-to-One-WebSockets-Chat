import Cookies from 'universal-cookie';
const properties ={
    INSTA_ACCESS_TOKEN_URL:'https://api.instagram.com/oauth/access_token',
    INSTA_REDIRECT_URL:'https://415443fbc085.ngrok.io/instalogin',
    // INSTA_INTERNAL_USER_INFO:'https://i.instagram.com/api/v1/users/{user_id}/info/',
    INSTA_CLIENT_ID:'156957412902052',
    INSTA_CLIENT_SECRECT:'f8a755b73bb53fdfcdc467ef5aa042d6',
    FB_APP_ID:'358238235599355',
    INSTA_USER_REGISTER:'http://localhost:8081/insta/register/user',
    GET_INSTA_ASSOCIATED_ACCOUNTS:'http://localhost:8081/insta/accounts',
    AUTH_SERVICE : "http://localhost:8081",
    CHAT_SERVICE : "http://localhost:8080"
}
export default properties;

export const cookies = new Cookies();

