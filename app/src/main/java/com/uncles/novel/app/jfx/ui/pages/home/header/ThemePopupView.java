package com.uncles.novel.app.jfx.ui.pages.home.header;

import com.jfoenix.controls.JFXColorPicker;
import com.jfoenix.controls.JFXPopup;
import com.uncles.novel.app.jfx.framework.annotation.FxView;
import com.uncles.novel.app.jfx.framework.ui.view.BaseView;
import com.uncles.novel.app.jfx.ui.app.App;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;

import java.awt.Color;


/**
 * 主题
 *
 * @author blog.unclezs.com
 * @date 2021/03/06 18:16
 */
@FxView(fxml = "/layout/home/header/theme.fxml")
public class ThemePopupView extends BaseView {
    public JFXPopup popup;
    public static final String THEME_FORMAT = "/css/home/theme/%s.css";
    public JFXColorPicker customColorButton;
    private Color color;

    @Override
    public void onCreated() {

    }

    /**
     * 切换主题
     *
     * @param event 点击切换
     */
    public void changeTheme(MouseEvent event) {
        Node themePalette = (Node) event.getSource();
        String theme = String.format(THEME_FORMAT, themePalette.getUserData().toString());
        App.changeTheme(theme);
        popup.hide();
    }


    public void customThemeColor(MouseEvent mouseEvent) {
        System.out.println(customColorButton.getValue());

    }
}
