<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<#include  "${base}/common/meta.ftl">
</head>
<body>
<div class="warp easyui-panel" data-options="border:false">
    <!-- Search panel start -->
    <div class="easyui-panel ui-search-panel" title="Search box" data-options="striped: true,collapsible:true,iconCls:'icon-search'">
        <form id="searchForm">
            <p class="ui-fields">
                <label class="ui-label">商家名称:</label>
                <input name="shopName" class="easyui-box ui-text" style="width:100px;">
            </p>
            <a href="#" id="btn-search" class="easyui-linkbutton" iconCls="icon-search">查询</a>
        </form>
    </div>
    <!--  Search panel end -->

    <!-- Data List -->
    <form id="listForm" method="post">
        <table id="data-list"></table>
    </form>
    <!-- Edit Win&Form -->
    <div id="edit-win" class="easyui-dialog" title="Basic window" data-options="closed:true,iconCls:'icon-save',modal:true" style="width:500px;height:480px;">
        <form id="editForm" class="ui-form" method="post">
            <input class="hidden" name="id">
            <div class="ui-edit">
                <div class="ftitle">商品商家</div>
                <div class="fitem">
                    <label>商家名称:</label>
                    <input class="easyui-validatebox" type="text" name="shopName" data-options="required:true" />
                </div>
                <div class="fitem">
                    <label>城市:</label>
                    <input class="easyui-validatebox" type="text" name="city"/>
                </div>
                <div class="fitem">
                    <label>地址:</label>
                    <input class="easyui-validatebox" type="text" name="address" />
                </div>
                <div class="fitem">
                    <label>手机:</label>
                    <input class="easyui-validatebox" type="text" name="mobile" data-options="required:true" />
                </div>
                <div class="fitem">
                    <label>座机:</label>
                    <input class="easyui-validatebox" type="text" name="phone" />
                </div>
                <div class="fitem">
                    <label>主页:</label>
                    <input class="easyui-validatebox" type="text" name="indexUrl" />
                </div>
                <div class="fitem">
                    <label>LOGO:</label>
                    <input class="easyui-validatebox" type="text" name="logoUrl" />
                </div>
                <div class="fitem">
                    <label>简介:</label>
                    <input class="easyui-validatebox" type="text" name="shopInfo" />
                </div>
            </div>
        </form>
    </div>
</div>

<script type="text/javascript" src="${base}/js/commons/YDataGrid.js"></script>
<script type="text/javascript" src="${base}/js/ux/shop/shop.js"></script>
</body>
</html>
