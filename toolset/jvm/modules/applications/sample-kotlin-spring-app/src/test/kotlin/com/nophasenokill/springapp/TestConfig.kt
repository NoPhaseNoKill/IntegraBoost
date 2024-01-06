package com.nophasenokill.springapp

import io.kotest.core.config.AbstractProjectConfig
import io.kotest.extensions.spring.SpringExtension

/**
 * 2022-10-31
 * @author CX无敌
 */
class TestConfig : AbstractProjectConfig() {
  override fun extensions() = listOf(SpringExtension)
}
