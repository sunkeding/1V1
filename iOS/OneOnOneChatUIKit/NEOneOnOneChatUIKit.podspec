# Copyright (c) 2022 NetEase, Inc. All rights reserved.
# Use of this source code is governed by a MIT license that can be
# found in the LICENSE file.

Pod::Spec.new do |s|
  s.name             = 'NEOneOnOneChatUIKit'
  s.version          = '1.0.0'
  s.summary          = 'A short description of NEOneOnOneChatUIKit.'
  
  # This description is used to generate tags and improve search results.
  #   * Think: What does it do? Why did you write it? What is the focus?
  #   * Try to keep it short, snappy and to the point.
  #   * Write the description between the DESC delimiters below.
  #   * Finally, don't worry about the indent, CocoaPods strips it!
  
  s.description      = <<-DESC
  TODO: Add long description of the pod here.
  DESC
  
  s.homepage         = 'https://github.com/mayajie@corp.netease.com/NEOneOnOneChatUIKit'
  # s.screenshots     = 'www.example.com/screenshots_1', 'www.example.com/screenshots_2'
  s.license          = { :type => 'MIT', :file => 'LICENSE' }
  s.author           = { 'mayajie@corp.netease.com' => 'mayajie@corp.netease.com' }
  s.source           = { :git => 'https://github.com/mayajie@corp.netease.com/NEOneOnOneChatUIKit.git', :tag => s.version.to_s }
  # s.social_media_url = 'https://twitter.com/<TWITTER_USERNAME>'
  
  s.ios.deployment_target = '10.0'
  s.swift_version = '5.0'
  
  s.source_files = 'Classes/**/*'
  s.dependency 'NEConversationUIKit'
  s.dependency 'NEChatUIKit'
  s.dependency 'NECommonKit'
  s.dependency 'SnapKit'
  s.dependency 'NEOneOnOneUIKit'
  s.dependency 'NERtcCallKit'
  s.dependency 'LottieSwift'
  
#  s.dependency 'NERtcCallKit'
  s.resource = 'Assets/**/*'
  
  s.pod_target_xcconfig = {
    'EXCLUDED_ARCHS[sdk=iphonesimulator*]' => 'arm64',
    'BUILD_LIBRARY_FOR_DISTRIBUTION' => 'YES'
  }
  
end
