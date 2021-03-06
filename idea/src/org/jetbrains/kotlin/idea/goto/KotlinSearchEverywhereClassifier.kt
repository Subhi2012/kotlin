/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.goto

import com.intellij.ide.actions.SearchEverywhereClassifier
import com.intellij.psi.PsiElement
import org.jetbrains.kotlin.asJava.unwrapped
import org.jetbrains.kotlin.psi.KtClassOrObject
import org.jetbrains.kotlin.psi.KtNamedDeclaration
import java.awt.Component
import javax.swing.JList

class KotlinSearchEverywhereClassifier : SearchEverywhereClassifier {
    override fun isClass(o: Any?) = o is KtClassOrObject

    override fun isSymbol(o: Any?) = o is KtNamedDeclaration

    override fun getVirtualFile(o: Any) = (o as? PsiElement)?.containingFile?.virtualFile

    override fun getListCellRendererComponent(list: JList<*>, value: Any?, index: Int, isSelected: Boolean, cellHasFocus: Boolean): Component? {
        val declaration = (value as? PsiElement)?.unwrapped as? KtNamedDeclaration ?: return null
        return KotlinSearchEverywherePsiRenderer(list).getListCellRendererComponent(list, declaration, index, isSelected, isSelected)
    }
}