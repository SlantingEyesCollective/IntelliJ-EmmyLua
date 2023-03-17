![logo](/snapshot/logo.png)
# cfxEmmyLua for IntelliJ IDEA

[![Build status](https://github.com/SlantingEyesCollective/cfxEmmyLua/actions/workflows/build.yml/badge.svg?branch=master)](https://github.com/SlantingEyesCollective/IntelliJ-EmmyLua/actions/workflows/build.yml)
[![EmmyLua Doc](https://img.shields.io/badge/emmy-doc-46BC99.svg?style=flat-square)](https://emmylua.github.io)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/9768-emmylua.svg?style=flat-square)](https://plugins.jetbrains.com/plugin/9768-emmylua)
[![Jetbrains plugin](https://img.shields.io/jetbrains/plugin/v/9768-emmylua.svg?style=flat-square)](https://plugins.jetbrains.com/plugin/9768-emmylua)

![snapshot](/snapshot/overview.gif)

## Find usages
![find_usages](/snapshot/find_usages.gif)

## Rename
![rename](/snapshot/rename.gif)

## Parameter hints
![param_hints](/snapshot/param_hints.png)
![param_hints_cfg](/snapshot/param_hints_cfg.png)

## Go to symbol
![go_to_symbol](/snapshot/go_to_symbol.gif)

## Go to class
![go_to_class](/snapshot/go_to_class.gif)

## Quick Documentation(Ctrl + Q)
![quick_documentation](/snapshot/quick_documentation.gif)

## Method separators
![method_separators_cfg](/snapshot/method_separators_cfg.png)
![method_separators](/snapshot/method_separators.png)

## Method override line marker
![method_override_line_marker](/snapshot/method_override_line_marker.gif)

## Features
| feature                              | progress |
|--------------------------------------|:--------:|
| Syntax highlighting                  |    ✔     |
| Highlighting global                  |    ✔     |
| Highlighting local/param             |    ✔     |
| Highlighting up value                |    ✔     |
| Lua 5.3 support                      |    ✔     |
| Find usages                          |    ✔     |
| Rename(Shift + F6)                   |    ✔     |
| Go to definition(Ctrl + Mouse)       |    ✔     |
| Go to symbol(Ctrl + Alt + Shift + N) |    ✔     |
| Go to class(Ctrl + N)                |    ✔     |
| Go to file(Ctrl + Shift + N)         |    ✔     |
| Parameter name hints                 |    ✔     |
| Keyword completion                   |    ✔     |
| Basic completion                     |    ✔     |
| Structure view                       |    ✔     |
| Brace Matching                       |    ✔     |
| Comment in/out                       |    ✔     |
| Color settings page                  |    ✔     |
| Comment based type/class annotation  |    ✔     |
| Method override line marker          |    ✔     |
| Name suggestion for refactor         |    ✔     |
| Quick Documentation(Ctrl + Q)        |    ✔     |
| Live templates                       |    ✔     |
| Postfix completion templates         |    14    |
| Code formatter                       |    ✔     |
| Code intentions                      |    9     |
| Code inspections                     |    7     |
| Lua Standard Library/API             |    ✔     |
| Region folding                       |    ✔     |
| Attach Debugger                      |    ✔     |
| Remote Debugger                      |    ✔     |
| Lua Check                            |    ✔     |
| Embed Remote Debugger                |    0%    |
| Lua Profiler                         |    ✔     |

## Road map
- [ ] Attach debugger rewriting
- [x] Remote debugger rewriting
- [ ] Data follow inspections
- [ ] Ctrl follow inspections
- [ ] `@interface` support
- [ ] API Hub

## Build environment requirements

- JDK 17
- Setup environment variables as following:

        JAVA_HOME="path to JDK 17"
        
## Building

  `./gradlew buildPlugin -DIDEA_VER=223`

## Developed By

[**@SlantingEyesCollective**](https://github.com/SlantingEyesCollective)

**Contributors**
- [**Official EmmyLua Contributors**](https://github.com/EmmyLua/IntelliJ-EmmyLua#developed-by)
