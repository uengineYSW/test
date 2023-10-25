
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import MemberMemberManager from "./components/listers/MemberMemberCards"
import MemberMemberDetail from "./components/listers/MemberMemberDetail"

import GradeGradeManager from "./components/listers/GradeGradeCards"
import GradeGradeDetail from "./components/listers/GradeGradeDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/members/members',
                name: 'MemberMemberManager',
                component: MemberMemberManager
            },
            {
                path: '/members/members/:id',
                name: 'MemberMemberDetail',
                component: MemberMemberDetail
            },

            {
                path: '/grades/grades',
                name: 'GradeGradeManager',
                component: GradeGradeManager
            },
            {
                path: '/grades/grades/:id',
                name: 'GradeGradeDetail',
                component: GradeGradeDetail
            },



    ]
})
