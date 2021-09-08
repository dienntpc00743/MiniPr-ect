app = angular.module("admin-app", ["ngRoute"]);

app.config(function($routeProvider) {
	$routeProvider
		.when("/products", {
			templateUrl: "/admin/product/index.html",
			controller: "product-ctrl"
		}).when("/account", {
			templateUrl: "/admin/account/index.html",
			controller: "account-ctrl"
		})
		.when("/authorize", {
			templateUrl: "/admin/authority/index.html",
			controller: "authority-ctrl"
		})
		.when("/unauthorized", {
			templateUrl: "/admin/authority/unauthorized.html",
			controller: "authority-ctrl"
		})
		.otherwise({
			template: "<h3 class='text-center'> DienPC Store </h3>"
		});
		
});