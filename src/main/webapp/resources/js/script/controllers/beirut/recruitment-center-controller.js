<<<<<<< HEAD
var candidatePositionModuleController = angular.module('x.beirut.candidate-module.controllers', []);

candidatePositionModuleController.controller('candidateSummary.ctrl', ['$scope', '$window', '$modal', 'candidateService', candidateSummaryModuleCtrlFunc]);

function candidateSummaryModuleCtrlFunc($scope, $window, $modal, candidateService){
    $scope.currentPage = 1;
    $scope.size = 10;
    $scope.numPages = $scope.totalRecords / $scope.size;
    $scope.currentRecords = (($scope.currentPage - 1) * $scope.size) + 1;
    $scope.totalRecords = 0;

    $scope.getAllCandidatePositionsSummary = function(){

        $scope.loading = true;
        candidateService.getAllCandidatePosition({
            query : '*:*',
            page  : $scope.currentPage - 1,
            size  : $scope.size
        }, function(response){
            //debug
            if(response.success){
                $scope.candidatePositions = response.content;
                $scope.totalRecords = response.pageMetaData.totalRecords;
                $scope.size = response.pageMetaData.pageSize;
                $scope.currentPage = response.pageMetaData.pageNumber + 1;
            } else {
                swal("Failed!", response.errorMessage, "error");
            }
            console.log(response);
            $scope.loading = false;
        }, function(error){
            swal('Error!', error.statusText, 'error');
            $scope.loading = false;
        });
    };

	$scope.getAllCandidatePositionsSummary();

}
=======
>>>>>>> af33bbf524d07fb546504ef9666f8c5a4389e8f1
