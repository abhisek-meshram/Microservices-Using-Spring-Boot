Microservices

Spring Version : 2.7.5

java version : 1.8

DataBase - Mysql 8.0.29 

Microservice Communication - RestTemplate or FeignClient
Service Registry - Eureka (server - client)
Fault Tolerance / Retry / Rate Limiter - Resilience 4j ()
Security - Okta
Config-Server- gitHub


okta login :  okta developers
(set up application/groups/people) in okta with permission
okta get token url : http://localhost:8084/auth/login (Enter login credentials).


learn more about okta



Get User Details Sample Curl Request

curl --location 'http://localhost:8084/users/24cfdd98-1df4-458d-8cb0-9c7c962050e0' \
--header 'Authorization: Bearer eyJraWQiOiIyVU5XSjc3aGdVWEVBTlFlMlgzMmcxZGxaM0hBcUwxUTEzU0pnakNYb1lvIiwiYWxnIjoiUlMyNTYifQ.eyJ2ZXIiOjEsImp0aSI6IkFULi1UZkZ4TlJjczg1Tjh0b2xBY3FQLVlnOGJJVGdIeG5SVGRQS05Dd1doV2sub2FyemRwaWh3Rzc0MTlmdDc1ZDYiLCJpc3MiOiJodHRwczovL2Rldi0yNDM4NzA3Ni5va3RhLmNvbS9vYXV0aDIvZGVmYXVsdCIsImF1ZCI6ImFwaTovL2RlZmF1bHQiLCJpYXQiOjE2ODAzMzk3NjUsImV4cCI6MTY4MDM0MzM2NSwiY2lkIjoiMG9hOHc0dXZ4d2hWaExoNTI1ZDciLCJ1aWQiOiIwMHU4dmt3cWVxdUZHN2JUMTVkNyIsInNjcCI6WyJlbWFpbCIsIm9mZmxpbmVfYWNjZXNzIiwib3BlbmlkIiwicHJvZmlsZSJdLCJhdXRoX3RpbWUiOjE2ODAzMzc1ODAsInN1YiI6ImFiaGlzZWttMDk5N0BnbWFpbC5jb20iLCJteWNsaWFtIjpbIkV2ZXJ5b25lIiwiQWRtaW4iXX0.rTRUQim0hHmbBGJKiA94v8Qm69f1EaLb-DMiuFFWCmsedpmktOUDYfC2fTEJpmEBFo0MX7lcvJJTjZlVm3QLU0DGP__lmeJlO0JhJ-pK0cLJkZcclaKcPwg3L9mS_VkZ_jPyAsyi3zSxxu9drw21VO7NpcFrt2k5ilZVpjBmW2idGWyK7PHxyjDIZG2oHJSz2IXInDgNeZ1Pl1JoWtNJltqctWjJLfRDXSx999f6DkS5Wv_DgQyB5ZBk6m3s44m3RxCquHsX90F7zd5H-1NL_GMyGx5jW3NFcOKTsQrSoNEjka8-xs4cRz9rIMRddKpK_FjjmsOp190xm-xdKLRtpQ' \
--header 'Cookie: JSESSIONID=EE8673C3AEDA686738B3710E93F0681F; SESSION=02c47c4c-8102-4c40-a323-87bcb39918ed'
