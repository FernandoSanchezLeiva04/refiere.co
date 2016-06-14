(function() {
  'use strict';

  angular
    .module('refiereApp.campaign')
    .service('CampaignService', CampaignService);

  CampaignService.$inject = ['$http', 'SessionModel', 'UserDataService'];

  /* @ngInject */
  function CampaignService($http, SessionModel, UserDataService) {

    this.getPrizeFromServer = getPrizeFromServer;
    this.getDatabaseFromServer = getDatabaseFromServer;
    this.setNewCampaign = setNewCampaign;
    var currentUser = UserDataService.getUserName();
    var encodedBasic = SessionModel.password;

    function getPrizeFromServer() {

      var request = {
        method: 'GET',
        url: 'http://localhost:5000/rest/v1/prize/all',
        headers: {
          'Content-Type': 'application/json',
          'Authorization': encodedBasic
        }
      };

      return $http(request);
    }

    function getDatabaseFromServer() {

      var request = {
        method: 'POST',
        url: 'http://localhost:5000/rest/v1/database/all',
        headers: {
          'Content-Type': 'application/json',
          'Authorization': encodedBasic
        },
        data: currentUser
      };

      return $http(request);
    }

    function setNewCampaign(campaignData) {
      return $http.post('http://localhost:5000/rest/v1/campaign', campaignData);
    }

  }

})();
