<%--
  Created by IntelliJ IDEA.
  User: asankah
  Date: 7/20/14
  Time: 8:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<div>
    <ul>
        <li class="${(not empty mainMenu && mainMenu == 'home')? 'selected' : '' }">HOME</li>
        <li class="${(not empty mainMenu && mainMenu == 'buy')? 'selected' : '' }">BUY</li>
        <li class="${(not empty mainMenu && mainMenu == 'sell')? 'selected' : '' }">SELL</li>
        <li class="${(not empty mainMenu && mainMenu == 'repair')? 'selected' : '' }">REPAIR</li>
    </ul>
</div>