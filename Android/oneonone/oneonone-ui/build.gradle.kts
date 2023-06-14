/*
 * Copyright (c) 2022 NetEase, Inc. All rights reserved.
 * Use of this source code is governed by a MIT license that can be
 * found in the LICENSE file.
 */

plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdk = 31
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation("com.netease.yunxin.kit:alog:1.0.9")
    implementation("androidx.appcompat:appcompat:1.4.1")
    implementation("com.google.android.material:material:1.5.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.3")
    implementation("androidx.recyclerview:recyclerview:1.2.1")

    api("com.netease.yunxin:nertc-base:4.6.50")
    api("com.netease.yunxin.kit.call:call-pstn:1.8.2"){
        exclude("com.netease.yunxin","nertc-base")
    }


    api("com.netease.yunxin.kit.common:common-network:1.1.8")
    implementation("com.netease.yunxin.kit.common:common-image:1.1.7")

    implementation("com.gyf.immersionbar:immersionbar:3.0.0")
    implementation("com.netease.yunxin.kit.auth:auth-yunxin-login:1.0.4")
    implementation("com.blankj:utilcodex:1.30.6")
    implementation("com.squareup.okhttp3:logging-interceptor:4.7.2")
    implementation("com.squareup.okhttp3:okhttp:4.9.3")
    implementation("com.google.code.gson:gson:2.9.0")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("androidx.navigation:navigation-fragment-ktx:2.4.2")
    implementation("androidx.navigation:navigation-ui-ktx:2.4.2")
    implementation("com.netease.yunxin.kit.common:common-ui:1.1.20")
    implementation("com.scwang.smart:refresh-layout-kernel:2.0.1")
    api("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")

    implementation(project(":beauty:beauty-ui"))
    implementation("com.netease.yunxin.kit.core:corekit:1.3.0")
    api(project(":entertainment:entertainment-common"))
    // 会话列表功能组件
    api("com.netease.yunxin.kit.conversation:conversationkit-ui:9.5.5-alpha01")
    // 聊天功能组件
    api("com.netease.yunxin.kit.chat:chatkit-ui:9.5.5-alpha01")
    //位置消息模块
    api("com.netease.yunxin.kit.locationkit:locationkit:9.5.5-alpha01")
    implementation("com.airbnb.android:lottie:5.0.3")

    implementation("com.netease.nimlib:neliveplayer:3.2.2")
    implementation("com.netease:gslb:1.1.4")

}