package com.gdn.x.ui.beirut.service;

import com.gdn.common.web.wrapper.response.GdnBaseRestResponse;
import com.gdn.common.web.wrapper.response.GdnRestListResponse;
import com.gdn.common.web.wrapper.response.GdnRestSingleResponse;
import com.gdn.x.beirut.dto.request.*;
import com.gdn.x.beirut.dto.response.*;

public interface BeirutService {


    public GdnBaseRestResponse applyNewPosition(String requestId, String username,
        ApplyNewPositionModelDTORequest applyNewPositionModelDTORequest) throws Exception;

    public GdnBaseRestResponse deleteCandidate(String requestId, String username,
        ListStringRequest idsRequest) throws Exception;

    public GdnBaseRestResponse deletePosition(String requestId, String username,
        ListStringRequest idsToDelete) throws Exception;

    public GdnRestListResponse<CandidateDTOResponse> findCandidateByCreatedDateBetweenAndStoreId(
        String requestId, String username, Long start, Long end, int page, int size)
        throws Exception;

    public GdnRestSingleResponse<CandidateDTOResponse> findCandidateByEmailAddressAndStoreId(
        String requestId, String username, String emailAddress) throws Exception;

    public GdnRestListResponse<PositionDTOResponse> getAllPositionWithPageable(String requestId,
        String username, int page, int size) throws Exception;

    public GdnRestListResponse<CandidatePositionSolrDTOResponse> getCandidatePositionBySolrQuery(
        String requestId, String username, String query, int page, int size) throws Exception;

    public GdnRestSingleResponse<CandidatePositionDTOResponse> getCandidatePositionDetailByStoreIdWithLogs(
        String requestId, String username, String idCandidate, String idPosition) throws Exception;

    public GdnRestListResponse<PositionDetailDTOResponse> getPositionDetailById(String requestId,
        String username, String id) throws Exception;

    public GdnBaseRestResponse insertNewCandidate(String requestId, String username,
        String candidateDTORequestString, byte[] data, String filename) throws Exception;

    public GdnBaseRestResponse insertNewPosition(String requestId, String username,
        String positionDTORequestString, byte[] data, String filename) throws Exception;

    public GdnBaseRestResponse updateCandidateDetail(String requestId, String username, String id,
        byte[] data, String filename) throws Exception;

    public GdnBaseRestResponse updateCandidateInformation(String requestId, String username,
        CandidateDTORequest candidateDTORequest) throws Exception;

    public GdnBaseRestResponse updateCandidatesStatus(String requestId, String username,
        UpdateCandidateStatusModelDTORequest updateCandidateStatusModelDTORequest) throws Exception;

    public GdnBaseRestResponse updatePositionDescription(String requestId, String username,
        String id, byte[] data, String filename) throws Exception;

    public GdnBaseRestResponse updatePositionInformation(String requestId, String username,
        PositionDTORequest positionDTORequest) throws Exception;

}
