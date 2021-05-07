import { useRecoilValue, useRecoilState } from "recoil";
import { loggedInInstaUser,loggedInUser} from "../atom/globalState";
import React, { useEffect, useState } from "react";
import { getInstaUserInfo } from "../util/ApiUtil";
import { Card, Avatar } from "antd";

import "./Profile.css";
const { Meta } = Card;



const Accounts =(props)=>{
    const LinkInstaAccount=(props)=>{
        getInstaUserInfo().then(
            res=>{
                console.log("associated insta accounsts are",res[0].instaUserName);
                // setinstaUserList(instaUserList => [...instaUserList, ...res[0]]);
                setinstaUserList(res[0]);
                console.log(res);
                
            }
        )
    }
    // const currentUser1 = useRecoilValue(loggedInUser);
    // const currentInstaUser2 = useRecoilValue(loggedInInstaUser);
 const [instaUserList, setinstaUserList] = useState({});
    // console.log("Accounts 1",currentUser1);
    // console.log("Accounts 2",currentInstaUser2);
     LinkInstaAccount(props);
     const currentInstaUser3={};
    //  =getInstaUserInfo()[0];
    console.log("33",{instaUserList});
    
//send both the requests

    return (
        <div className="profile-container">
      <Card
        style={{ width: 420, border: "1px solid #e1e0e0" }}
        // actions={[<LogoutOutlined onClick={logout} />]}
      >
        <Meta
          avatar={
            <Avatar
              src={currentInstaUser3.instaProfilePicUrl}
              className="user-avatar-circle"
            />
          }
          title={currentInstaUser3.instaUserName}
          description={"@" + currentInstaUser3 .instaUserName}
        />
      </Card>
    </div>
    )

}

export default Accounts;