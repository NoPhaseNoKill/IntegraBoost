package com.integraboost.store

import org.junit.jupiter.api.extension.ExtensionContext

object SharedAppStore {
    private val GLOBAL_NAMESPACE: ExtensionContext.Namespace = ExtensionContext.Namespace.GLOBAL

    fun getRoot(extensionContext: ExtensionContext): ExtensionContext.Store {
        return extensionContext.root.getStore(GLOBAL_NAMESPACE)
    }

    fun putObjectIntoGlobalStore(context: ExtensionContext, uniqueKey: Any, value: Any) {
        context.root.getStore(GLOBAL_NAMESPACE).put(uniqueKey, value)
    }
}