import { useRecoilValue, useRecoilState } from "recoil";
import { loggedInInstaUser,loggedInUser} from "../atom/globalState";
import React, { useEffect, useState } from "react";
import { getInstaUserInfo } from "../util/ApiUtil";
import { Card, Avatar } from "antd";

import "./Profile.css";
const { Meta } = Card;



const Accounts =(props)=>{
    const LinkInstaAccount=(props)=>{
        console.log("fetching linked insta profiles");
        getInstaUserInfo().then(
            res=>{
                console.log("associated insta accounsts are",res[0].instaUserName);
                setinstaUserList(res);
                console.log(res);
                
            }
        )
    }
 const [instaUserList, setinstaUserList] = useState([]);
    useEffect(() => {
        LinkInstaAccount(props);
      }, []);
     
    if(instaUserList[0]){
    return (
        <div className="profile-container">
      <Card
        style={{ width: 420, border: "1px solid #e1e0e0" }}
        // actions={[<LogoutOutlined onClick={logout} />]}
      >
        <Meta
          avatar={
            <Avatar
              src={instaUserList[0].instaProfilePicUrl}
              className="user-avatar-circle"
            />
          }
          title={instaUserList[0].instaUserName}
          description={"@" + instaUserList[0].instaUserName}
        />
      </Card>
    </div>
    );
        }
        else{
          return(<div>
            does not any associated insta account
          </div>);
        }

}

export default Accounts;