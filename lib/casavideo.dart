
import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

class Casavideo {
  static const MethodChannel _channel = MethodChannel('casavideo');


  static openNativeActivity() {
    debugPrint("Open Native Activity");
    _channel.invokeMethod('secondActivity');
  }

  static Future<String?> get platformVersion async {
    final String? version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }
}
