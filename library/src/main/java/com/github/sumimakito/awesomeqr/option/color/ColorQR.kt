package com.github.sumimakito.awesomeqr.option.color

class ColorQR(var auto: Boolean = false,
              var background: Int = 0xFFFFBBAA.toInt(),
              var light: Int = 0xFFFFFFFF.toInt(),
              var dark: Int = 0xFFE57373.toInt()) {
    fun duplicate(): ColorQR {
        return ColorQR(auto, background, light, dark)
    }
}