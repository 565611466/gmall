package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.bean.*;

import java.util.List;
import java.util.Map;

public interface ManageService {

    public List<BaseCatalog1> getCatalog1();

    public List<BaseCatalog2> getCatalog2(String catalog1Id);

    public List<BaseCatalog3> getCatalog3(String catalog2Id);

    public List<BaseAttrInfo> getAttrList(String catalog3Id);

    public BaseAttrInfo getAttrInfo(String id);

    public  void  saveAttrInfo(BaseAttrInfo baseAttrInfo);


}


