
  <h2 align="center">QuotiePie - A slice of inspiration</h2>


## ℹ️ Project Info : 
**QuotiePie** is an app that displays a random inspirational quote to help users start their day or stay motivated. It is built to demonstrate the use of Modern Android development (MAD) tools , based on MVVM Clean Architecture & Jetpack compose. App is mainly divided into 3 layers i.e ```data```, ```domain``` & ```app``` (presentation).
It also showcase the implemetation of some of the Modern Jetpack Architecture Component.

## Built With 🛠
- [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
- [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - For asynchronous and more..
- [Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/) - A cold asynchronous data stream that sequentially emits values and completes normally or with an exception.
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes.
- [Dependency Injection](https://developer.android.com/training/dependency-injection)
  - [Koin](https://dagger.dev/hilt) - Koin is a smart Kotlin dependency injection library to keep you focused on your app, not on your tools. **This is in the [main branch](https://github.com/InsertKoinIO/koin)**.
- [Retrofit](https://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java.
- [Material Components for Android](https://github.com/material-components/material-components-android) - Modular and customizable Material Design UI components for Android.
- [Gradle Kotlin DSL](https://docs.gradle.org/current/userguide/kotlin_dsl.html) - For writing Gradle build scripts using Kotlin.


[0]:  https://kotlinlang.org/
[1]:  https://kotlinlang.org/docs/coroutines-overview.html
[2]:  https://developer.android.com/kotlin/flow
[3]:  https://developer.android.com/jetpack/compose
[4]:  https://developer.android.com/develop/ui/views/launch/splash-screen
[5]:  https://github.com/square/retrofit
[6]:  https://dagger.dev/hilt/

## 🧰 Other Tools :
* [Kotlin DSL][7] : For writing gradle script for Kotlin is more readable and offers better compile-time.
* [Version Catalog][8] : Declaring gradle dependencies & plugins in central place.
* [Github Actions(CI/CD)][9] : Automate the build, test, and deployment pipeline through Github Actions.
* [Renovate][10] : To keep the app dependencies up-tp-date automatically.

[7]:  https://docs.gradle.org/current/userguide/kotlin_dsl.html
[8]:  https://docs.gradle.org/current/userguide/platforms.html
[9]:  https://github.com/features/actions
[10]: https://docs.renovatebot.com/

## 🏗️ App Architecture :
App is build using Clean Architecture design pattern. Which consist of three module as follows :
* [**app**](https://github.com/guerbejhamdi/QuotiePie-Android/tree/master/app) - This module is responsible for handling user interaction, displaying data and managing user interface. Usually this module is decoupled from bossiness logic and communicate with domain module for accessing any data.
* [**domain**](https://github.com/guerbejhamdi/QuotiePie-Android/tree/master/domain) - In this module contains core bussiness logic and it doesn't contains any platform related api usage and should only use java/kotlin language apis.
* [**data**](https://github.com/guerbejhamdi/QuotiePie-Android/tree/master/data) - This module is mainly responsible for accessing data from remote or local source which is being called from domain module only.

![Clean-Architecture-in-Android](https://miro.medium.com/v2/resize:fit:1400/format:webp/1*vcnYWWn_zhNk6I30meBaPg.png)


### Video
https://github.com/guerbejhamdi/QuotiePie-Android/assets/60189133/b20d82fc-f1b1-4694-b1d0-695580395f4b



## 🧪 Testing (ToDo):
* Coming soon

## 🌿 Branches :
* [**master**](https://github.com/guerbejhamdi/QuotiePie-Android) - master branch will contain the production code which is deployed by [CD Pipeline](https://github.com/guerbejhamdi/QuotiePie-Android/actions/workflows/android_cd.yml).
* [**develop**](https://github.com/guerbejhamdi/QuotiePie-Android/tree/develop) - develop branch will contain the on-going app feature developement or bug fix code which is targeted for upcoming release validated by [CI Pipeline](https://github.com/guerbejhamdi/QuotiePie-Android/actions/workflows/android_ci.yml).

## 🚧 ToDo's :
- [ ] Display Quote by selected Category
- [ ] Unit Testing
- [ ] UI Testing
- [ ] Offline Capability for quotes

## 🙌 Contributions :
We welcome contributions to improve this project, Whether you want to fix a bug, implement a new feature, or suggest an enhancement, we're open to your ideas. Please create the issue at [here](https://github.com/guerbejhamdi/QuotiePie-Android/issues) & If you have implemented some changes then raise the Pull request over ```develop``` branch.

## 🤝 acknowledgement :
QuotiePie project use [Quotable API](https://github.com/lukePeavey/quotable) to fetch and display quotes in app.

## Connect with me:
[![Github Profile](https://skillicons.dev/icons?i=github)](https://github.com/guerbejhamdi)
[![LinkedIn](https://skillicons.dev/icons?i=linkedin)](https://www.linkedin.com/in/hamdiguerbej/)

## License :
```
MIT License

Copyright (c) 2023 Hamdi Guerbej

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

</br>
