package com.fall23.helper;

import com.fall23.ui.drivers.Driver;
import java.util.LinkedList;
import java.util.Set;

public class WindowHelper {

    //управлять вкладками-список всех открытых вкладок возвращает
    public Set<String> getWindowHandles() {
        //
        return Driver.getDriver().getWindowHandles();
    }
    //переключиться какой-то окошке, переключаемся по индексу
    //поэтому параметр передаем int index
    public void switchToWindow(int index) {

        //список открытых вкладок сохраняем в LinkedList<String> windowsId
        //в листе все по порядку, поэтому выбрали лист  //открытые вкладки передали в скобку
        LinkedList<String> windowsId = new LinkedList<>(getWindowHandles());

        //если индекс выйдет за рамки, выдает исключение
        if (index < 0 || index > windowsId.size()) {
            throw new IllegalArgumentException("You provide wrong Index " + index);
        }
        //если все ок, переходит сюда и переключается на нужный индекс
        Driver.getDriver().switchTo().window(windowsId.get(index));
    }

    public void switchToParent() {
        LinkedList<String> windowsId = new LinkedList<>(getWindowHandles());
        Driver.getDriver().switchTo().window(windowsId.get(0));
    }

    public void switchToParentWithChildClose() {
        switchToParent();
        LinkedList<String> windowsId = new LinkedList<>(getWindowHandles());

        for (int i = 1; i < windowsId.size(); i++){
            Driver.getDriver().switchTo().window(windowsId.get(i));
            Driver.getDriver().close();
        }
        switchToParent();
    }

}