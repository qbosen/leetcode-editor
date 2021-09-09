package com.shuzijun.leetcode.plugin.actions.toolbar;

import com.intellij.openapi.actionSystem.ActionGroup;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author qiubaisen
 * @date 2021/9/9
 */
public class SelectLangAction extends ActionGroup {
    @Override @NotNull public AnAction[] getChildren(@Nullable AnActionEvent anActionEvent) {
        return new AnAction[0];
    }
}
