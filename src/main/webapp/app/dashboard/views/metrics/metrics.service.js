(function() {
  'use strict';

  angular
    .module('refiereApp.metrics')
    .service('MetricService', MetricService);

  MetricService.$inject = ['$http', 'SessionModel', 'UserDataService'];

  /* @ngInject */
  function MetricService($http, SessionModel, UserDataService) {

    this.getReferredFromServer = getReferredFromServer;
    this.getCampaignFromServer = getCampaignFromServer;
    this.getCompanyPrizeFromServer = getCompanyPrizeFromServer;
    var currentUser = UserDataService.getUserName();
    var encodedBasic = SessionModel.password;
    var companyId = UserDataService.getCompanyID();

    function getReferredFromServer() {

      var request = {
        method: 'GET',
        url: 'http://localhost:5000/rest/v1/metrics/referredAmount',
        headers: {
          'Content-Type': 'application/json',
          'Authorization': encodedBasic
        }
      };

      return $http(request);
    }

    function getCampaignFromServer() {
      var urlCompany = 'http://localhost:5000/rest/v1/metrics/company/'+companyId+'/campaignsAmount';

      var request = {
        method: 'GET',
        url: urlCompany,
        headers: {
          'Content-Type': 'application/json',
          'Authorization': encodedBasic
        }
      };

      return $http(request);
    }

    function getCompanyPrizeFromServer() {
       var urlCompanyPrize = 'http://localhost:5000/rest/v1/metrics/company/'+companyId+'/campaignsAmountPrize';
      var request = {
        method: 'GET',
        url: urlCompanyPrize,
        headers: {
          'Content-Type': 'application/json',
          'Authorization': encodedBasic
        }
      };

      return $http(request);
    }

  }

})();