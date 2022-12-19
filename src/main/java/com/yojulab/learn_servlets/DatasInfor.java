package com.yojulab.learn_servlets;

import java.util.ArrayList;
import java.util.HashMap;

import com.yojulab.learn_servlets.beans.MemberBean;


public class DatasInfor {
    public HashMap<String, String> getSearchFormData() {
        HashMap<String, String> searchForm = new HashMap<String, String>();
        searchForm.put("search_key", "Search Title");
        searchForm.put("name", "요주의랩!");
        searchForm.put("id", "ID0001");
        return searchForm;
    }

    public ArrayList<String> getTablesListWithString() {
        ArrayList<String> tablesListWithString = new ArrayList<String>();
        tablesListWithString.add("@mdo");
        tablesListWithString.add("@fat");
        tablesListWithString.add("@twitter");
        return tablesListWithString;
    }

    public HashMap<String, Object> getBundlesData() {
        DatasInfor datasInfor = new DatasInfor();
        HashMap<String, String> searchForm = datasInfor.getSearchFormData();
        ArrayList<String> tablesListWithString = datasInfor.getTablesListWithString();

        HashMap<String, Object> bundlesData = new HashMap<>();
        bundlesData.put("searchForm", searchForm);
        bundlesData.put("tablesListWithString", tablesListWithString);

        bundlesData.put("dataWithMamberBean", datasInfor.getDataWithMamberBean());
        bundlesData.put("dataListWithMemberBean", datasInfor.getDataListWithMemberBean());

        return bundlesData;
    }

    public MemberBean getDataWithMamberBean(){
        MemberBean memberBean = new MemberBean();
        memberBean.setFirstName("Mark");
        memberBean.setSecondName("Otto");
        memberBean.setHandleName("@mdo");

        return memberBean;
    }

    public ArrayList<MemberBean> getDataListWithMemberBean() {
        ArrayList<MemberBean> membersList = new ArrayList<>();
        MemberBean memberBean = new MemberBean();
        memberBean.setFirstName("Mark");
        memberBean.setSecondName("Otto");
        memberBean.setHandleName("@mdo");
        membersList.add(memberBean);

        memberBean = new MemberBean();
        memberBean.setFirstName("Jacob");
        memberBean.setSecondName("Thornton");
        memberBean.setHandleName("@fat");
        membersList.add(memberBean);

        memberBean = new MemberBean();
        memberBean.setFirstName("Larry");
        memberBean.setSecondName("Bird");
        memberBean.setHandleName("@twitter");
        membersList.add(memberBean);
        return membersList;
    }
}
