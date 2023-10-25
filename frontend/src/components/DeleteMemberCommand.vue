<template>
    <v-card outlined>
        <v-card-title>
            DeleteMember
        </v-card-title>

        <v-card-text>
            <String label="MemberId" v-model="value.memberId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="deleteMember"
            >
                DeleteMember
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'DeleteMemberCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.memberId = '';
        },
        watch: {
        },
        methods: {
            deleteMember() {
                this.$emit('deleteMember', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

