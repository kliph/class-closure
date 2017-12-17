(ns class-closure.state
  (:require [reagent.core :as r]))

(def app-state (r/atom {:dates "commit,date
1fb8a3423206573b2cd7e0bf87cd4d1496058963,2017-11-28
f7c3754c22805ddabea18f1435060cacfc29e12c,2017-09-20
edc211288d8adc03f08b0b659eade944756789a6,2017-09-20
2c9fd6dbb724c098862b8e3a89ae7dc6a27bbdf8,2017-08-17
4e44745e89a4344e8dee7c92b9f4be26eb133613,2017-08-10
7d710a5188c6173aeb25b9ed278bea29db1a4338,2017-08-09
a9ff89f0e982efe3870a009d1c897564b676e808,2017-08-09
bd7fb725706bcc5a3234663a6e17532106e5c01c,2017-08-07
ba55611f6c93b69c6969bec722e67833fb015f4d,2017-08-07
29514224fbb10a246c5cbd44a14bee1e09686f2e,2017-08-07
ce812a0fff998429882ca1ba19e7f99a66404f53,2017-07-31
d150f7a3213c65df64c27b67b74ad8b2b20b69f9,2017-07-31
8af741e242650843ef55de37e8202747feafc27c,2017-07-31
c1d214c80db43da72741bbfd2bab31e24e87ae30,2017-07-23
3359be67ef993222eedb8bc9a8886e4c52f502eb,2017-07-23
f15e4492e4db2d3f1b6faccc6a8277a75454fc80,2017-07-12
3d9c80106ef10181601642cffb9073c7a88b2382,2017-07-02
0009f440e3c4c8652ef03313fc1a579fe29a1eeb,2017-07-02
00ecf701fb4c4c30a5cd93583c9621cebfa09e58,2017-06-15
53673e7739fdff7dbc527ad3343978c25e0360f1,2017-06-15
53131a0a80346148e34ed8777e002736abf36a42,2017-06-15
46c35a14da9845ab921a45deea62edf11d08c925,2017-06-13
028ba9380d8a2c335e8f349215237f7e905c6ae6,2017-06-13
bce57844aaefc0d963221f5f4ecc1e52886eb4a2,2017-06-05
ccdef520fa6d99cc7f341078dbf437f8320ce7c1,2017-06-04
45d066c04fa38cda811b2975e98cc48675460147,2017-06-04
ec2dff88122e57f34b29f36a800a9d2f1d726b75,2017-05-29
ab47eb0143e3bba86c989ff0160e73d2736c50ad,2017-05-29
5b983226450ee66fa196e10bf73f8e1118bdfbf7,2017-05-28
141ebb18ed34cc9dc49b43635be345c959b205df,2017-05-25
a9d8aa943d7101c6f2d1b81c22a8254f224f8bf9,2017-05-24
4b4680ec8a875b7a3341646cd096dc95720c360c,2017-05-17
9fd864538366ec7266c87569d2a3190e3812cc5b,2017-05-17
30f0b17fae9ba9e9f224ebae74b641133402b55c,2017-05-16
78731fa09e0b08236309d7fe3109130a71a01c96,2017-05-15
c8b492bf830d6f8eeaffe7b789ad4a93f01fbe15,2017-05-15
a573d2bcddf1b5c4f09a15ab7a352ac654fb82d3,2017-05-14
91edede6e0e50e26f901f3295c39511c752f76a2,2017-05-13
5b735a1d82694d03e15fe0a94a12b29968598cd8,2017-05-11
2bb2844ea4b6c82c9333e42c00c2fdcc0b492538,2017-05-10
ef7ca51dcd3699e0c2b3bdc259ab028c8d3da975,2017-05-10
32e7083b424aad8dd655f416e8cee036e310055a,2017-05-08
4cbecec03bbfc67e6a256b00006e64606ba5e497,2017-05-07
a737b9e4dc05e2fbfb73bf400f7e6577426d715d,2017-05-07
077598c72e93b0ac65c0abf43db9f1ed5ffa65ff,2017-05-07
162705ee0b4300f7136fc7c589e6073f6b2ce298,2017-05-07
943abab9c9907acbb7b9f10a64efbebf400b5bfb,2017-05-07
fb8b5c8f911ba798552c7beab79205fd4e1caf40,2017-05-07
0c19a6c975641d62d70ef046471fa4603ff82ba0,2017-05-03
5dfe942242212b0c841440bab6ddce6929f14548,2017-05-02
bf9a1492346bd3fc832cef770102345672588220,2017-05-02
d3d9615025e824ae06bc7ba0a8440422db12585b,2017-05-02
7fd2299079b40cd01d81f942ccd113b362090d4c,2017-05-02
484c35ec2da30b910c8bdae4814c103eebd2113a,2017-05-01
a80d801076b92eb13c143bec4b29ab3a56eb52fd,2017-05-01
a4cbe4d4846a677de170c083c911d4be9af0799e,2017-04-27
ec37bcdaff557b15bc9818ed4bcd5aa40e66f05e,2017-04-18
b5fce4d72be973efe591ba9026d0de968a9988d6,2017-04-18
d32ff825caea3426ac25bd4dd06fda212455ae94,2017-04-18
3f1fea9fdfdf9e69694d292ba3019b49d4365490,2017-04-14
6525d21099540f0828270d43ac219e6817a60e3b,2017-04-11
8a8ada72b3a294049f58ec330050c6155d211a4a,2017-04-11
a54b6076a3e03e8668230d241393f946ea11a1e6,2017-04-09
12db2d800c09e6af4064d7b3eea778bd5d7210ea,2017-04-08
90f64df4582ee919b19c42b66408d5bafe79a6b0,2017-04-06
d592b5a15e308835055c65c8969291183cac0650,2017-04-05
61dd648d590c447b1994aeb821e6e6f88bf6b43c,2017-04-05
9f44430c7ee2b055d4ecb37aa7687421ede5cb68,2017-04-02
382a0f0849457cd0bf0d9e773c15271ac5131a65,2017-04-02
8bf5fd221fe64b78655d2f543e02df88fe1fece7,2017-03-26
0e9f8462779a2c781cb182fadce4aca5da4ede0c,2017-03-26
b1aa00beb1822659fdc04e7ceb41ae6e947d3b6b,2017-03-26
c951173709ff92fe49cbb6e4523a85a7b09f98af,2017-03-26
0696bad72774d5f95a492c58a618ef017e86a76a,2017-03-26
9b180516424d2b250fb0dfd564c905e26d346f33,2017-03-24
15992364c57116dca84f28fb8085108cb9de19cd,2017-03-24
ba789b36848d423aba1c5a805500cabbf1e018c7,2017-03-24
f93f2d335c13b529cc174d7a74feb26ffb57d232,2017-03-23
c0f7f4b5ec7390e38b31d810f45b97e9f3c9555f,2017-03-23
42b1f5859cf642de7475db53a0d734c826473c99,2017-03-23
5d92fbdebb99c484adf698db2d16af47c0f53f4a,2017-03-22
e85d18af66b642c008eceb06bc0c34be8fb3dd82,2017-03-21
123bb535006d57f0a7862ee33a465c853f495144,2017-03-21
953b72dc055ba406607e4fcb5ef1d26050a5a9d9,2017-03-20
e22b92a6e86797cca31d11d389c8ab035f16119e,2017-03-20
6a300f39ede29f380c4a952cce8b66a8825b74ff,2017-03-20
114002847c4d2fb65b97cf7c21615fc72b6f643d,2017-03-20
356befb69ae4abba84b285922d369322e98f1813,2017-03-19
67119e09dc666c5f493c51f546ca252ab65244ea,2017-03-19
7d42e3535d80789a60d3ff7fb1b8f277720c948c,2017-03-18
b45990c7fcaf79fe7f8f9d691337a58f9a45ef7f,2017-03-18
0d0c4f47a5d8b60f12c87d11002f10ed5a4a7cd3,2017-03-18
a44cd2b6fdd388a16ea372f0cbc730d60dae3bee,2017-03-18
838fa4d3536d58f7e8c1af5b2b52a23bda29b91e,2017-03-16
da30977e20ec2339e919c81d4b5e3a4edafe3319,2017-03-16
7f4eb8c4545d1d5ab0c92164c596895a99151f1d,2017-03-16
4285e015fb003d548f41a68059fa725d6f619564,2017-03-15
39b1a5ef1cb0a373925821a75368695ee9e2cd64,2017-03-13
ea4cad46022bd362b58721674d0d87afa87c42e8,2017-03-09
3a051e40c078c40acf4a17269d8085539adde79a,2017-03-09
d30b1dffb93b012f8691357f1a8c8dae6eb8b428,2017-03-09
001b1a4719588f21a9eb06803a2c5f0aab653017,2017-03-09
17df4967d001d7ee16811c95324a85c8b61c379a,2017-03-08
0e551ce80d4b321927b402ba205e1e759c076bac,2017-03-08
dace10dab3d3b4607b5f61cdb82cb70b781bde5d,2017-03-08
a7d8f1f367aca3d0e5605669f1177b573f2a9b8c,2017-03-08
6bd7bf49b4a52083504b67427f1b79fd54017c70,2017-03-08
3944ac44b1bd9ab1f4f4b28211c62b64bd207343,2017-03-08
4f51ba9ba7ba787285fd242fdd06a86d238bccf6,2017-03-08
88fed2b8956ad8d2c85967327e5ebb7a7da25512,2017-03-07
09de596638b9c33cfa615007fc5f9d8feb486381,2017-03-07
b941b84475f4e4dad1ec8c9f644c3e8f366de553,2017-03-07
da2c426166c75491269536bc557b9b7b9a1b3c86,2017-03-07
f2c4de9f6c8a60a823a9d764222c3f01b7876174,2017-03-07
5652e2ec934ae757c89a5fe9e73807c9ef8ae371,2017-03-06
6e8e2227f9adefc5fafeff2d5a5e0c962c811b21,2017-03-06
7ef2daa7b39483da7c164a79fb43ee83c3e28944,2017-03-06
f4a6be029024e5620c50948a46e14e71de1fe408,2017-03-05
75326a90b549fed474334a8875bc6f773def1a55,2017-03-05
b3bf1a36489f57b936c810bcecdba750d6d677bd,2017-03-05
840766dd8525d3e328b0f478f7fadbbeb8a6e441,2017-03-03
71975acdc9d6b558ebe70ffe9520b022c163d97e,2017-03-03
95a7bf11a7534b7b1b94323f3ce9a410bbd5526d,2017-03-03
3433ffceb38897e5292df35b3ce14ef90e4e27cf,2017-03-02
ca0c4fab0e3003cfc05b70bce136e4a2884f12b0,2017-03-01
90ebdadf0403fde8379a95c6c27f117910b9eeb1,2017-02-28
d56d22fe14352a1b2f674487fd2bd7762c10dc69,2017-02-27
aed73bd14ad8c3d991d2f25e49486e56968a2144,2017-02-27
336e85424731e4bc38b51f2d1101cf08c1ebf584,2017-02-27
c5aee887e64135c38730dfe7460c81997e7a0752,2017-02-27
82d599786b60dfc9d7a0fa1036f0538bbea73f3f,2017-02-27
bfecfa79fa1016f6a4c89bebe6f3ba90d387db5c,2017-02-27
a2fe00116530c6d17b59eedea4537aa8f00b8f69,2017-02-26
"
                        :closures "filename,first-commit,last-commit
.gitignore,a2fe00116530c6d17b59eedea4537aa8f00b8f69,a44cd2b6fdd388a16ea372f0cbc730d60dae3bee
Procfile,a2fe00116530c6d17b59eedea4537aa8f00b8f69,00ecf701fb4c4c30a5cd93583c9621cebfa09e58
README.org,bfecfa79fa1016f6a4c89bebe6f3ba90d387db5c,53131a0a80346148e34ed8777e002736abf36a42
circle.yml,f2c4de9f6c8a60a823a9d764222c3f01b7876174,114002847c4d2fb65b97cf7c21615fc72b6f643d
dev/dev/repl.clj,a2fe00116530c6d17b59eedea4537aa8f00b8f69,53131a0a80346148e34ed8777e002736abf36a42
profiles.clj.example,a44cd2b6fdd388a16ea372f0cbc730d60dae3bee,a44cd2b6fdd388a16ea372f0cbc730d60dae3bee
project.clj,a2fe00116530c6d17b59eedea4537aa8f00b8f69,f7c3754c22805ddabea18f1435060cacfc29e12c
resources/log4j.properties,0d0c4f47a5d8b60f12c87d11002f10ed5a4a7cd3,0d0c4f47a5d8b60f12c87d11002f10ed5a4a7cd3
resources/migrations/20170316191604-fixtures.down.sql,838fa4d3536d58f7e8c1af5b2b52a23bda29b91e,838fa4d3536d58f7e8c1af5b2b52a23bda29b91e
resources/migrations/20170316191604-fixtures.up.sql,838fa4d3536d58f7e8c1af5b2b52a23bda29b91e,838fa4d3536d58f7e8c1af5b2b52a23bda29b91e
resources/migrations/20170427095221-add-user.down.sql,a4cbe4d4846a677de170c083c911d4be9af0799e,a4cbe4d4846a677de170c083c911d4be9af0799e
resources/migrations/20170427095221-add-user.up.sql,a4cbe4d4846a677de170c083c911d4be9af0799e,a4cbe4d4846a677de170c083c911d4be9af0799e
resources/migrations/20170512075555-add-previous-picks-to-user.down.sql,91edede6e0e50e26f901f3295c39511c752f76a2,91edede6e0e50e26f901f3295c39511c752f76a2
resources/migrations/20170512075555-add-previous-picks-to-user.up.sql,91edede6e0e50e26f901f3295c39511c752f76a2,91edede6e0e50e26f901f3295c39511c752f76a2
resources/migrations/20170515194840-add-current-pick-to-users.down.sql,91edede6e0e50e26f901f3295c39511c752f76a2,78731fa09e0b08236309d7fe3109130a71a01c96
resources/migrations/20170515194840-add-current-pick-to-users.up.sql,78731fa09e0b08236309d7fe3109130a71a01c96,78731fa09e0b08236309d7fe3109130a71a01c96
resources/migrations/20170516181014-gameweeks.down.sql,30f0b17fae9ba9e9f224ebae74b641133402b55c,30f0b17fae9ba9e9f224ebae74b641133402b55c
resources/migrations/20170516181014-gameweeks.up.sql,30f0b17fae9ba9e9f224ebae74b641133402b55c,a9ff89f0e982efe3870a009d1c897564b676e808
resources/migrations/20170517192638-standings-stats.down.sql,9fd864538366ec7266c87569d2a3190e3812cc5b,9fd864538366ec7266c87569d2a3190e3812cc5b
resources/migrations/20170517192638-standings-stats.up.sql,9fd864538366ec7266c87569d2a3190e3812cc5b,9fd864538366ec7266c87569d2a3190e3812cc5b
resources/migrations/20170523201649-results.down.sql,a9d8aa943d7101c6f2d1b81c22a8254f224f8bf9,a9d8aa943d7101c6f2d1b81c22a8254f224f8bf9
resources/migrations/20170523201649-results.up.sql,a9d8aa943d7101c6f2d1b81c22a8254f224f8bf9,a9d8aa943d7101c6f2d1b81c22a8254f224f8bf9
resources/public/admin.html,a2fe00116530c6d17b59eedea4537aa8f00b8f69,840766dd8525d3e328b0f478f7fadbbeb8a6e441
resources/public/css/style.css,a2fe00116530c6d17b59eedea4537aa8f00b8f69,7d710a5188c6173aeb25b9ed278bea29db1a4338
resources/public/index.html,a2fe00116530c6d17b59eedea4537aa8f00b8f69,53131a0a80346148e34ed8777e002736abf36a42
resources/sql/queries.sql,838fa4d3536d58f7e8c1af5b2b52a23bda29b91e,ec2dff88122e57f34b29f36a800a9d2f1d726b75
script/bootstrap,bfecfa79fa1016f6a4c89bebe6f3ba90d387db5c,53673e7739fdff7dbc527ad3343978c25e0360f1
script/fetch-google-oauth-platform-js,edc211288d8adc03f08b0b659eade944756789a6,edc211288d8adc03f08b0b659eade944756789a6
script/migrate-production,953b72dc055ba406607e4fcb5ef1d26050a5a9d9,953b72dc055ba406607e4fcb5ef1d26050a5a9d9
script/server,b3bf1a36489f57b936c810bcecdba750d6d677bd,53673e7739fdff7dbc527ad3343978c25e0360f1
script/test,bfecfa79fa1016f6a4c89bebe6f3ba90d387db5c,7f4eb8c4545d1d5ab0c92164c596895a99151f1d
script/update,bfecfa79fa1016f6a4c89bebe6f3ba90d387db5c,838fa4d3536d58f7e8c1af5b2b52a23bda29b91e
src/gapi/platform.js,162705ee0b4300f7136fc7c589e6073f6b2ce298,1fb8a3423206573b2cd7e0bf87cd4d1496058963
src/threadstreaks/account.cljs,3433ffceb38897e5292df35b3ce14ef90e4e27cf,4e44745e89a4344e8dee7c92b9f4be26eb133613
src/threadstreaks/admin.cljs,840766dd8525d3e328b0f478f7fadbbeb8a6e441,53673e7739fdff7dbc527ad3343978c25e0360f1
src/threadstreaks/auth.cljs,95a7bf11a7534b7b1b94323f3ce9a410bbd5526d,53673e7739fdff7dbc527ad3343978c25e0360f1
src/threadstreaks/color.cljs,001b1a4719588f21a9eb06803a2c5f0aab653017,53673e7739fdff7dbc527ad3343978c25e0360f1
src/threadstreaks/core.cljs,a2fe00116530c6d17b59eedea4537aa8f00b8f69,53673e7739fdff7dbc527ad3343978c25e0360f1
src/threadstreaks/db/core.clj,838fa4d3536d58f7e8c1af5b2b52a23bda29b91e,53673e7739fdff7dbc527ad3343978c25e0360f1
src/threadstreaks/fixtures.cljs,c5aee887e64135c38730dfe7460c81997e7a0752,ce812a0fff998429882ca1ba19e7f99a66404f53
src/threadstreaks/home.cljs,ca0c4fab0e3003cfc05b70bce136e4a2884f12b0,53673e7739fdff7dbc527ad3343978c25e0360f1
src/threadstreaks/routes.cljs,3a051e40c078c40acf4a17269d8085539adde79a,53673e7739fdff7dbc527ad3343978c25e0360f1
src/threadstreaks/standings.cljs,336e85424731e4bc38b51f2d1101cf08c1ebf584,bd7fb725706bcc5a3234663a6e17532106e5c01c
src/threadstreaks/state.cljs,c5aee887e64135c38730dfe7460c81997e7a0752,53673e7739fdff7dbc527ad3343978c25e0360f1
src/threadstreaks/team.cljs,90ebdadf0403fde8379a95c6c27f117910b9eeb1,53673e7739fdff7dbc527ad3343978c25e0360f1
src/threadstreaks/web.clj,a2fe00116530c6d17b59eedea4537aa8f00b8f69,2c9fd6dbb724c098862b8e3a89ae7dc6a27bbdf8
test/threadstreaks/api_test.clj,82d599786b60dfc9d7a0fa1036f0538bbea73f3f,a9ff89f0e982efe3870a009d1c897564b676e808
test/threadstreaks/db/core_test.clj,a44cd2b6fdd388a16ea372f0cbc730d60dae3bee,a9ff89f0e982efe3870a009d1c897564b676e808
test/threadstreaks/fixtures_test.cljs,f2c4de9f6c8a60a823a9d764222c3f01b7876174,53673e7739fdff7dbc527ad3343978c25e0360f1
test/threadstreaks/runner.cljs,f2c4de9f6c8a60a823a9d764222c3f01b7876174,53673e7739fdff7dbc527ad3343978c25e0360f1
test/threadstreaks/test_util.cljs,4f51ba9ba7ba787285fd242fdd06a86d238bccf6,53673e7739fdff7dbc527ad3343978c25e0360f1
test/threadstreaks/update_account_test.cljs,6bd7bf49b4a52083504b67427f1b79fd54017c70,53673e7739fdff7dbc527ad3343978c25e0360f1
"}))