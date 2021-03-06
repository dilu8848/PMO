package com.pmo.dashboard.dao;

import java.util.LinkedHashMap;
import java.util.List;

import com.pmo.dashboard.entity.CandidateInfo;

public interface CandidateMapper
{
    List<CandidateInfo> queryCandidateList(CandidateInfo candidate);
    int queryCandidateCount(CandidateInfo candidate);
    String queryCandidateResumePath(CandidateInfo candidate);
    List<LinkedHashMap<String,String>> queryExportData(CandidateInfo candidate);
    List<CandidateInfo> queryMyCandidateList(CandidateInfo candidate);
    int queryMyCandidateCount(CandidateInfo candidate);
    boolean updateCandidateInfo(CandidateInfo candidate);
}
