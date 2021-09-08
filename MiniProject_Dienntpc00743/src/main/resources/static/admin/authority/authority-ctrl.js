app.controller("authority-ctrl", function($scope, $http) {
	$scope.roles = [];
	$scope.admins = [];
	$scope.authorities = [];

	$scope.initialize = function() {
		//Hien thi tat ca vai tro
		$http.get("/rest/roles").then(resp => {
			$scope.roles = resp.data;
		})
		$http.get("/rest/account").then(resp => {
			$scope.admins = resp.data;
		})
		$http.get("/rest/authoritie").then(resp => {
			$scope.authorities = resp.data;
		}).catch(error => {
			$location.path("/unauthorized")
		})
	}
	$scope.authority_of = function(acc, role) {
		if ($scope.authorities) {
			return $scope.authorities.find(ur => ur.account.username == acc.username && ur.role.id == role.id)	
		}
	}
	$scope.authority_changed = function(acc, role) {
		var authority = $scope.authority_of(acc, role);
		if (authority) {
			$scope.revoke_authority(authority);
		}
		else {
			authority = { account: acc, role: role };
			$scope.grant_authority(authority);
		}
	}

	//xóa authority 
	$scope.revoke_authority = function(authority) {
		$http.delete(`/rest/authoritie/${authority.id}`).then(resp => {
			var index = $scope.authorities.findIndex(a =>
				a.id == authority.id
			)
			$scope.authorities.splice(index , 1);
			alert("Thu hồi quyền sử dụng thành công !!!")
		}).catch(error => {
			alert("Thu hồi quyền thất bại !!!")
			console.log("Error",error);
		})
	}

	//thêm authority
	$scope.grant_authority = function(authority){
		$http.post(`/rest/authoritie`,authority).then(resp => {
			$scope.authorities.push(resp.data)
			alert("Cấp quyền sử dụng thành công !!!")
		}).catch(error =>{
			alert("Cấp quyền thất bại !!!");
			console.log("Error",error);
		})

	} 
	$scope.initialize();
});