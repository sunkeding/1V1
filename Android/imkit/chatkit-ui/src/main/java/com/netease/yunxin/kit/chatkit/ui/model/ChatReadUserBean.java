// Copyright (c) 2022 NetEase, Inc. All rights reserved.
// Use of this source code is governed by a MIT license that can be
// found in the LICENSE file.

package com.netease.yunxin.kit.chatkit.ui.model;

import android.text.TextUtils;
import com.netease.yunxin.kit.common.ui.viewholder.BaseBean;
import com.netease.yunxin.kit.corekit.im.model.UserInfo;
import java.util.ArrayList;
import java.util.List;

public class ChatReadUserBean extends BaseBean {

  public UserInfo userInfo;
  public String teamId;

  public ChatReadUserBean(UserInfo user, String tid) {
    userInfo = user;
    teamId = tid;
  }

  public static List<ChatReadUserBean> generateChatSearchBean(
      String teamId, List<UserInfo> userInfoList) {
    List<ChatReadUserBean> beanList = new ArrayList<>();
    if (userInfoList != null && !TextUtils.isEmpty(teamId)) {
      for (UserInfo user : userInfoList) {
        beanList.add(new ChatReadUserBean(user, teamId));
      }
    }
    return beanList;
  }
}
